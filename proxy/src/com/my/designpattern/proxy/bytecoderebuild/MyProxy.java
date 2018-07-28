package com.my.designpattern.proxy.bytecoderebuild;

import com.my.designpattern.proxy.Customer;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyProxy {

    //test
    public static void main(String[] args) {
        Class[] interfaces = {Customer.class};
        String src = generateSrc(interfaces);
        //System.out.println(src);

        String filePath = MyProxy.class.getResource("").getPath();
        //System.out.println(filePath);

        newProxyInstance(null,interfaces,null);

    }

    public static Object newProxyInstance(MyClassLoader classLoader,Class<?> [] interfaces,MyInvocationHandler h) {

        //1. generate java source code,
        String src = generateSrc(interfaces);

        //2. write java file to disk (file)
        String filePath = MyProxy.class.getResource("").getPath();
        File javaSourceFile = new File(filePath + "$Proxy0.java");
        try {
            FileWriter fw = new FileWriter(javaSourceFile);
            fw.write(src);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //3. compile java file to class file
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager standardJavaFileManager = javaCompiler.getStandardFileManager(null,null,null);
        Iterable iterable  = standardJavaFileManager.getJavaFileObjects(javaSourceFile);

        JavaCompiler.CompilationTask compilationTask = javaCompiler.getTask(null,standardJavaFileManager,null,null,null,iterable);
        compilationTask.call();
        try {
            standardJavaFileManager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4. load class
        try {
            //Class proxyClass = MyProxy.class.getClassLoader().loadClass("$Proxy0");

            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor constructor = proxyClass.getConstructor(MyInvocationHandler.class);
            return constructor.newInstance(h);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;

    }

    private static String generateSrc(Class[] interfaces){
        String ln = "\r\n";

        StringBuffer sb = new StringBuffer();
        sb.append("package com.my.designpattern.proxy.bytecoderebuild;" + ln);
        sb.append("import com.my.designpattern.proxy.Customer;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("MyInvocationHandler h;" + ln);

        sb.append("public $Proxy0(MyInvocationHandler h) { " + ln);

        sb.append("this.h = h;");

        sb.append("}" + ln);


        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }

        sb.append("}" + ln);

        return sb.toString();
    }

}
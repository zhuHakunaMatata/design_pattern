package com.my.designpattern.proxy.bytecoderebuild;

import java.io.*;

public class MyClassLoader extends ClassLoader {

    private File classpathDir;

    public MyClassLoader(){
        String classpathName = MyClassLoader.class.getResource("").getPath();
        this.classpathDir = new File(classpathName);
    }

    public File getClasspathDir() {
        return classpathDir;
    }

    public void setClasspathDir(File classpathDir) {
        this.classpathDir = classpathDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName() +"." + name;
        if(classpathDir !=null){
            File classFile = new File(classpathDir,name.replaceAll("\\.","/")+".class");
            try {
                FileInputStream in = new FileInputStream(classFile);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] buff = new byte[1024];
                int length = 0;
                while( (length =in.read(buff)) != -1){
                    out.write(buff,0,length);
                }
                return defineClass(className,out.toByteArray(),0,out.size());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

package com.my.designpattern.proxy.bytecoderebuild;

import com.my.designpattern.proxy.Customer;
import java.lang.reflect.Method;

public class StockInsuranceAgent implements  MyInvocationHandler {

    private Customer target;

    //get $Proxy object for target
    public Object getInstance(Customer target ){
        this.target = target;
        Class clazz = this.target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" stock insurance agent will service for a business man ...");
        System.out.println(proxy.getClass());//class com.sun.proxy.$Proxy0
        System.out.println(method.getName());//buyInsurance
        method.invoke(target);
        System.out.println("stock insurance agent completes the service ... " );

        return null;
    }
}

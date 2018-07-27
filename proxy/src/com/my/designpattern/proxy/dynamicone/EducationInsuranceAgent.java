package com.my.designpattern.proxy.dynamicone;

import com.my.designpattern.proxy.Customer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class EducationInsuranceAgent implements InvocationHandler {
    private Customer target;

    //get $Proxy object for target
    public Object getInstance(Customer target ){
        this.target = target;
        Class clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" education insurance agent will service for a student ...");
        System.out.println(proxy.getClass());//class com.sun.proxy.$Proxy0
        System.out.println(method.getName());//buyInsurance
        method.invoke(target);
        System.out.println("education insurance agent completes the service ... " );

        return null;
    }
}

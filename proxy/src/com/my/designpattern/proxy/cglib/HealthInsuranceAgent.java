package com.my.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HealthInsuranceAgent implements MethodInterceptor {

    public Object getInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        try {
            enhancer.setSuperclass(HealthCustomer.class);
            enhancer.setCallback(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(" health insurance agent completes the service ... ");
        System.out.println(o.getClass());
        //System.out.println(o);
        methodProxy.invokeSuper(o,objects);
        System.out.println(" health insurance agent completes the service ... ");
        return null;
    }
}

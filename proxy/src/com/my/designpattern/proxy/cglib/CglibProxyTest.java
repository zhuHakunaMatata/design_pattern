package com.my.designpattern.proxy.cglib;

public class CglibProxyTest {
    public static void main(String[] args) {
        HealthInsuranceAgent healthInsuranceAgent = new HealthInsuranceAgent();
        HealthCustomer customerProxy = (HealthCustomer)healthInsuranceAgent.getInstance(HealthCustomer.class);
        customerProxy.buyInsurance();
        //System.out.println(customerProxy.getClass());

    }

}

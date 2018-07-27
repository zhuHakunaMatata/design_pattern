package com.my.designpattern.proxy.dynamicone;

import com.my.designpattern.proxy.Customer;

public class DynamicProxyTest {
    public static void main(String[] args) {
        StudentCustomer studentCustomer = new StudentCustomer();
        System.out.println("how many times to call buyInsurance() : " + StudentCustomer.count);

        Customer customer = (Customer) new EducationInsuranceAgent().getInstance(studentCustomer);
        //System.out.println(customer.getClass());//class com.sun.proxy.$Proxy0
        customer.buyInsurance();
        customer.buyInsurance();
        //System.out.println(customer);//null ????????
        System.out.println("how many times to call buyInsurance() : " + StudentCustomer.count);//2

    }

}

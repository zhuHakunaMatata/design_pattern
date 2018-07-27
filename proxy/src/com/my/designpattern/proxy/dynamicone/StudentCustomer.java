package com.my.designpattern.proxy.dynamicone;

import com.my.designpattern.proxy.Customer;

public class StudentCustomer implements Customer {
    public static int count = 0;

    @Override
    public void buyInsurance() {
        count ++;
        System.out.println(" buy an insurance for education ... ");
    }
}

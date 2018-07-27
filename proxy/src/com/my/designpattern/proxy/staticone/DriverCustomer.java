package com.my.designpattern.proxy.staticone;

import com.my.designpattern.proxy.Customer;

public class DriverCustomer implements Customer {
    @Override
    public void buyInsurance(){
        System.out.println("buy an insurance for a car...");
    }
}

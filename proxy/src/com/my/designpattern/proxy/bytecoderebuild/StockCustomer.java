package com.my.designpattern.proxy.bytecoderebuild;

import com.my.designpattern.proxy.Customer;

public class StockCustomer implements Customer {
    @Override
    public void buyInsurance() {
        System.out.println(" buy an insurance for stock plunged ...");
    }
}

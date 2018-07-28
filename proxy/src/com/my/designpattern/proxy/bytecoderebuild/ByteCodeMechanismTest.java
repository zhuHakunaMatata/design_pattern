package com.my.designpattern.proxy.bytecoderebuild;

import com.my.designpattern.proxy.Customer;

public class ByteCodeMechanismTest {
    public static void main(String[] args) {
        StockCustomer stockCustomer = new StockCustomer();
        StockInsuranceAgent stockInsuranceAgent = new StockInsuranceAgent();
        Customer proxy = (Customer) stockInsuranceAgent.getInstance(stockCustomer);
        proxy.buyInsurance();

    }
}

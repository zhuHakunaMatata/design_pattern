package com.my.designpattern.proxy.staticone;

public class StaticProxyTest {
    public static void main(String[] args) {
        DriverCustomer driverCustomer = new DriverCustomer();
        InsuranceAgent agent = new InsuranceAgent(driverCustomer);
        agent.buyInsurance();

    }

}

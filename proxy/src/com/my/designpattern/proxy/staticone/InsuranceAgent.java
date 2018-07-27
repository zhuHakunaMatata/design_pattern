package com.my.designpattern.proxy.staticone;

public class InsuranceAgent {
    private DriverCustomer target;

    public InsuranceAgent(DriverCustomer target) {
        this.target = target;
    }

    public DriverCustomer getTarget() {
        return target;
    }

    public void setTarget(DriverCustomer target) {
        this.target = target;
    }

    public void buyInsurance(){
        System.out.println(" insurance agent will service for a customer ...");
        target.buyInsurance();
        System.out.println(" insurance agent completes the service");

    }
}

package com.my.designpattern.strategy.pay.service;

public class JDPay implements Payable {
    @Override
    public PayState pay(String uid, Long amount) {
        System.out.println("-- JD pay----");
        return new PayState(200,amount,"success ...");
    }
}

package com.my.designpattern.strategy.pay.service;

public class AliPay implements Payable {
    @Override
    public PayState pay(String uid, Long amount) {
        System.out.println("-- ali pay----");
        return new PayState(200,amount,"success ...");
    }
}

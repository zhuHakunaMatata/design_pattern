package com.my.designpattern.strategy.pay.service;

public class WechatPay implements Payable {
    @Override
    public PayState pay(String uid, Long amount) {
        System.out.println("-- wechat  pay----");
        return new PayState(200,amount,"success ...");
    }
}

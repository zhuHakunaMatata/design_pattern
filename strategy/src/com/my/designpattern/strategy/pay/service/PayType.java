package com.my.designpattern.strategy.pay.service;

public enum PayType {
    ALI_PAY (new AliPay()),
    WECHAT_PAY(new WechatPay()),
    JD_PAY(new JDPay());


    private Payable payable;
    PayType(Payable payable) {
        this.payable = payable;
    }

    public Payable getPayable() {
         return this.payable;
    }
}

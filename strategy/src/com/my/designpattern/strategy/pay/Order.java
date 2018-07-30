package com.my.designpattern.strategy.pay;

import com.my.designpattern.strategy.pay.service.AliPay;
import com.my.designpattern.strategy.pay.service.PayState;
import com.my.designpattern.strategy.pay.service.Payable;

public class Order   {
    private String uid;
    private String oid;
    private Long amount;

    public Order(String uid, String oid, Long amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "uid='" + uid + '\'' +
                ", oid='" + oid + '\'' +
                ", amount=" + amount +
                '}';
    }

    public PayState pay(Payable payable) {
        return payable.pay(uid,amount);
    }
}

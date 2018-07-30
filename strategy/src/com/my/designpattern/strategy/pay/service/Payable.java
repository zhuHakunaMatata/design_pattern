package com.my.designpattern.strategy.pay.service;

public interface Payable {
    PayState pay(String uid, Long amount);
}

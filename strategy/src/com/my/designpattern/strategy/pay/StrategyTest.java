package com.my.designpattern.strategy.pay;

import com.my.designpattern.strategy.pay.service.AliPay;
import com.my.designpattern.strategy.pay.service.JDPay;
import com.my.designpattern.strategy.pay.service.PayType;
import com.my.designpattern.strategy.pay.service.WechatPay;

public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order("00001","sml0000001", (long) 100);
      /*  System.out.println(order.pay(new AliPay()));
        System.out.println(order.pay(new WechatPay()));
        System.out.println(order.pay(new JDPay()));
*/
        //use Enum
        System.out.println(order.pay(PayType.JD_PAY));
        System.out.println(order.pay(PayType.JD_PAY));
        System.out.println(order.pay(PayType.WECHAT_PAY));



    }
}

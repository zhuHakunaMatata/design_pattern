package com.my.designpattern.factory.abstr;

import com.my.designpattern.factory.Car;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factory = new CarFactoryImpl();
        Car bwm = factory.getBWM();
        System.out.println(bwm.getName());

        Car toyota = factory.getToyota();
        System.out.println(toyota.getName());
    }
}

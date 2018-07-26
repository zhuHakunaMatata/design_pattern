package com.my.designpattern.factory.simple;

import com.my.designpattern.factory.Car;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car bwm = simpleFactory.getCar("BWM");
        System.out.println(bwm.getName());

        Car toyota = simpleFactory.getCar("ToyotaFactory");
        System.out.println(toyota.getName());
    }

}

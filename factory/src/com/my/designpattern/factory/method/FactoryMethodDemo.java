package com.my.designpattern.factory.method;

import com.my.designpattern.factory.Car;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Factory bwmFactory = new BWMFactory();
        Car bwm = bwmFactory.getCar();
        System.out.println(bwm.getName());

        Factory toyotaFactory = new ToyotaFactory();
        Car toyota = toyotaFactory.getCar();
        System.out.println(toyota.getName());
    }
}

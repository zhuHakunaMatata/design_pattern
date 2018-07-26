package com.my.designpattern.factory.method;

import com.my.designpattern.factory.Car;
import com.my.designpattern.factory.Toyota;

public class ToyotaFactory implements Factory {
    @Override
    public Car getCar() {
        return new Toyota();
    }
}

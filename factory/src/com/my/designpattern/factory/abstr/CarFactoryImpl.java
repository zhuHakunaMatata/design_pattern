package com.my.designpattern.factory.abstr;

import com.my.designpattern.factory.BWM;
import com.my.designpattern.factory.Car;
import com.my.designpattern.factory.Toyota;

public class CarFactoryImpl implements AbstractFactory {
    @Override
    public Car getBWM() {
        return new BWM();
    }

    @Override
    public Car getToyota() {
        return new Toyota();
    }
}

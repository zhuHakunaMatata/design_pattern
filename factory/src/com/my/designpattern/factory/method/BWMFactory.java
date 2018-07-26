package com.my.designpattern.factory.method;

import com.my.designpattern.factory.BWM;
import com.my.designpattern.factory.Car;

public class BWMFactory implements Factory {

    @Override
    public Car getCar() {
        return new BWM();
    }
}

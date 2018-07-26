package com.my.designpattern.factory.simple;

import com.my.designpattern.factory.BWM;
import com.my.designpattern.factory.Car;
import com.my.designpattern.factory.Toyota;

public class SimpleFactory {

    public Car getCar(String name){
        if("BWM".equals(name)){
            return new BWM();
        }else if("ToyotaFactory".equals(name)){
            return  new Toyota();
        }else {
            return null;
        }
    }
}

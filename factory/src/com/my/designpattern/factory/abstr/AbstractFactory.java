package com.my.designpattern.factory.abstr;
import com.my.designpattern.factory.Car;

/*
* offer an interface for creation of different Cars
*
*
* */

public interface AbstractFactory {

    public Car getBWM();

    public Car getToyota();

}

package com.my.designpattern.factory;

public class RawDemo {
    public static void main(String[] args) {
        BWM bwm = new BWM();
        System.out.println(bwm.getName());

        Toyota toyota = new Toyota();
        System.out.println(toyota.getName());
        
    }
}

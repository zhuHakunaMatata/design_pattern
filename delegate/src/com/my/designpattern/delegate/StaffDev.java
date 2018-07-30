package com.my.designpattern.delegate;

public class StaffDev implements IWork {
    @Override
    public void doWork() {
        System.out.println("developer does great work .....");
    }
}

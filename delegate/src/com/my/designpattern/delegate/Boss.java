package com.my.designpattern.delegate;

public class Boss {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.manage("BA");
        manager.manage("Dev");

    }
}

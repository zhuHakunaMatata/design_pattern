package com.my.designpattern.singleton.hungry;

//static : JVM will create an Earth instance when loading Earth.class
public class Earth {
    private static Earth instance = new Earth();

    //private : the outer user can not create an instance
    private Earth(){}

    //
    public static Earth getInstance(){return instance;}

}

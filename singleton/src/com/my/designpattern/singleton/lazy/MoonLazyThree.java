package com.my.designpattern.singleton.lazy;

public class MoonLazyThree {

    private MoonLazyThree(){}

    public static MoonLazyThree getInstance(){
        return MoonHolder.instance;
    }

    //as default JVM will not load this static inner class
    //jvm will load static inner class only when access its fields or method
    private static class MoonHolder {
        public static final MoonLazyThree instance = new MoonLazyThree();
    }
}

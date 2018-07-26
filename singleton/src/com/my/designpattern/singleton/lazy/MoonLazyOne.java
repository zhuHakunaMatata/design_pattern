package com.my.designpattern.singleton.lazy;

public class MoonLazyOne {
    private static MoonLazyOne instance=null;

    private MoonLazyOne(){}

    public static MoonLazyOne getInstance() {
        if(instance == null) instance = new MoonLazyOne();
        return instance;
    }
}

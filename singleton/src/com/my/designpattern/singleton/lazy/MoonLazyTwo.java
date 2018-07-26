package com.my.designpattern.singleton.lazy;

public class MoonLazyTwo {
    private static MoonLazyTwo instance = null;

    private MoonLazyTwo(){}

    public static synchronized MoonLazyTwo getInstance(){
        if(instance ==null) instance = new MoonLazyTwo();
        return instance;
    }

}

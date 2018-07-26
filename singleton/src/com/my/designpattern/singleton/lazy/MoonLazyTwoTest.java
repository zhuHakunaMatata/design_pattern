package com.my.designpattern.singleton.lazy;

import com.my.designpattern.base.AbstractTest;

public class MoonLazyTwoTest extends AbstractTest {

    public static void main(String[] args) {
        //createSingletonTest(MoonLazyTwo.class);
        //threadSafeTest(MoonLazyTwo.class);
        //performanceTest(MoonLazyTwo.class);

        singleThreadPerformanceTest();
    }


    private static void singleThreadPerformanceTest(){
        long start = System.currentTimeMillis();
        for(int i=0;i<20000;i++){
            new Thread(){
                @Override
                public void run(){
                    Object obj = MoonLazyTwo.getInstance();
                    //System.out.println();
                }
            }.start();
        }
        long end = System.currentTimeMillis();
        System.out.println("it take : " + (end-start) + "  milli-seconds");

    }
}

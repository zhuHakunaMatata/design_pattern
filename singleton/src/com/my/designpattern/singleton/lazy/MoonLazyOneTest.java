package com.my.designpattern.singleton.lazy;

import com.my.designpattern.base.AbstractTest;

import java.util.concurrent.CountDownLatch;

public class MoonLazyOneTest extends AbstractTest {
    public static void main(String[] args) {
        //createSingletonTest(MoonLazyOne.class);
        //threadSafeTest(MoonLazyOne.class);
        //performanceTest(MoonLazyOne.class);
        performanceTest();
    }

    private static void createSingletonTest() {
        MoonLazyOne moon1 = MoonLazyOne.getInstance();
        MoonLazyOne moon2 = MoonLazyOne.getInstance();

        System.out.println(moon1);
        System.out.println(moon2);
        System.out.println(moon1==moon2);//true

    }

    // result ????
    private static void threadSafeTest() {
        int count = 200;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for(int i=0;i<count;i++){
            new Thread() {
                @Override
                public void run(){
                    try{
                        countDownLatch.await();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    MoonLazyOne moon = MoonLazyOne.getInstance();
                    System.out.println(moon);
                }
            }.start();
            countDownLatch.countDown();
        }
    }

    private static void performanceTest(){
        long start = System.currentTimeMillis();
        for(int i=0;i<20000;i++){
            new Thread(){
                @Override
                public void run(){
                    Object obj = MoonLazyOne.getInstance();
                    //System.out.println();
                }
            }.start();
        }
        long end = System.currentTimeMillis();
        System.out.println("it take : " + (end-start) + "  milli-seconds");

    }

}

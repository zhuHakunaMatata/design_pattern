package com.my.designpattern.base;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

public class AbstractTest {
    protected static Method getInstance ;
    protected static void createSingletonTest(Class clazz){
        try {
            getInstance = clazz.getMethod("getInstance");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            Object obj1 = getInstance.invoke(clazz);
            Object obj2 = getInstance.invoke(clazz);
            System.out.println(obj1);
            System.out.println(obj1);
            System.out.println(obj1==obj1);//true
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected static void threadSafeTest(Class clazz){
        try {
            getInstance = clazz.getMethod("getInstance");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
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
                    try{
                        Object obj = getInstance.invoke(clazz);
                        System.out.println(obj);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
            countDownLatch.countDown();
        }
    }

    protected static void performanceTest(Class clazz){
        try {
            getInstance = clazz.getMethod("getInstance");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        long start = System.currentTimeMillis();
        for(int i=0;i<20000;i++){
            new Thread(){
                @Override
                public void run(){
                    try{
                        Object obj = getInstance.invoke(clazz);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
        }

        long end = System.currentTimeMillis();
        System.out.println("it take :   " + (end-start) + "   milli-seconds");

    }


}

package com.my.designpattern.singleton.hungry;
import com.my.designpattern.base.AbstractTest;
import java.util.concurrent.CountDownLatch;

public class EarthTest extends AbstractTest {


    public static void main(String[] args) {

        createSingletonTest(Earth.class);
        //createSingletonTest();
        //threadSafeTest();
    }


    private static void createSingletonTest(){
        Earth earth1 = Earth.getInstance();
        Earth earth2 = Earth.getInstance();
        System.out.println(earth1);
        System.out.println(earth2);
        System.out.println(earth1==earth2);//true

    }

    //thread safe only at the creation stage
    private static void threadSafeTest(){
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
                    Earth e = Earth.getInstance();
                    System.out.println(e);
                }
            }.start();
            countDownLatch.countDown();
        }
    }

}

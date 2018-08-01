package com.my.designpattern.observer.standard;

// Observer or Listener
public class LightObserver implements LightListener{
    private int id;

    public LightObserver(int id){
        this.id = id;
        System.out.println("LightObserver : " + id + " is created ");
    }

    @Override
    public void lightOn(LightEvent e) {
        // TODO Auto-generated method stub
        System.out.println(" LightObserver :  " + id + " i am noticed the light is on ");
    }

    @Override
    public void lightOff(LightEvent e) {
        // TODO Auto-generated method stub
        System.out.println(" LightObserver :  " + id + " i am noticed the light is off ");
    }

}
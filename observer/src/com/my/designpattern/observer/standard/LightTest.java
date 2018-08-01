package com.my.designpattern.observer.standard;

public class LightTest {

    public static void main(String[] args) {

        // ( 1 ). create a Subject
        Light light = new Light();

        // ( 2 ). create 3 observer/listener
        LightObserver observer1 = new LightObserver(1);
        LightObserver observer2 = new LightObserver(2);
        LightObserver observer3 = new LightObserver(3);

        // ( 3 ). register listener to Subject
        light.addLightListener(observer1);
        light.addLightListener(observer2);
        light.addLightListener(observer3);

        // ( 4 ). trig the event
        light.turnOn();
        light.turnOff();

        light.removeLightListener(observer1);
        light.turnOn();

    }

}

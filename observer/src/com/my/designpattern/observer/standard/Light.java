package com.my.designpattern.observer.standard;

import java.util.ArrayList;

// Subject
public class Light {
    // Status - on (true) or off (false)
    private boolean on;
    //Listener list
    private ArrayList<LightListener> listeners = new ArrayList<LightListener>();

    /** Constructors */
    public Light(){
        this.on = false; // initially off
        System.out.println(" Light: constructed and off ");
    }


    /** add the given LightListener */
    public void addLightListener(LightListener listener){
        listeners.add(listener);
        System.out.println(" add a LightListener ");
    }

    /** remove  the given LightListener */
    public void removeLightListener(LightListener listener){
        listeners.remove(listener);
        System.out.println(" remove a LightListener ");
    }

    /** Construct an LightEvent and trig the appropriate handler on its registered listeners */
    public void notifyListener(){
        LightEvent event = new LightEvent(this);

        for (LightListener listener : listeners){
            if(on){
                listener.lightOn(event);
            }else{
                listener.lightOff(event);
            }
        }
    }

    /** turn on the light */
    public void turnOn(){
        if(!on){
            on = !on;
            System.out.println(" turn on the light ");
            notifyListener();
        }
    }

    /** turn off the light */
    public void turnOff(){
        if(on){
            on=!on;
            System.out.println(" turn off the light ");
            notifyListener();
        }
    }

}

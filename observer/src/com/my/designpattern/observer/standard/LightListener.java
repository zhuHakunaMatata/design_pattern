package com.my.designpattern.observer.standard;

import java.util.EventListener;

//public interface LightListener extends EventListener{

public interface LightListener {
    public void lightOn(LightEvent e);
    public void lightOff(LightEvent e);
}

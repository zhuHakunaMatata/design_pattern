package com.my.designpattern.observer.simulate.base;

import java.lang.reflect.Method;

public class Event {
    private Object source;
    // no use
    private Method callback;

    public Event(Object source) {
        this.source = source;
    }
    public Event(Object source, Method callback) {
        this.source = source;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    @Override
    public String toString() {
        return "Event{" +
                "\n\t source=" + source +
                ", \n\t callback=" + callback +
                '}';
    }
}

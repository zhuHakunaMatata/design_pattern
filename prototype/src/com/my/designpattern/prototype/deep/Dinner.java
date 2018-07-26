package com.my.designpattern.prototype.deep;

import java.io.*;

public class Dinner implements Cloneable , Serializable {
    private Lemon lemon;

    public Lemon getLemon() {
        return lemon;
    }

    public void setLemon(Lemon lemon) {
        this.lemon = lemon;
    }

    @Override
    public Object clone(){
        return this.deepClone();
    }



    //keep diving into class hierarchy until all copy value is primitive type value
    public Dinner deepClone1(){
        Dinner dinner = new Dinner();
        Lemon lemon = new Lemon();
        lemon.setPrice(this.getLemon().getPrice());
        dinner.setLemon(lemon);
        return dinner;
    }


    /**
     *  The key point is that when we readObject() from an input stream ,
     *  the inside work in JVM is to deep-copy the Object.
     *
     *
     * First write this object into an output stream;
     * then read it from the output stream into an input stream;
     * then get the object from the input stream.
     *
     * @return Dinner
     */
    public Dinner deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            try {
                Dinner  copy = (Dinner)ois.readObject();
                return copy;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *  reflection !!!!
     */

}

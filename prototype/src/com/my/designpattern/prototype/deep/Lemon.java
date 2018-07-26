package com.my.designpattern.prototype.deep;

import java.io.Serializable;

public class Lemon implements Serializable {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

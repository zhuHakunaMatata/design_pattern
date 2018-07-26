package com.my.designpattern.prototype.deep;

public class DinerTest {
    public static void main(String[] args) {
        Dinner dinner = new Dinner();
        Lemon lemon = new Lemon();
        lemon.setPrice("high");
        dinner.setLemon(lemon);

        Dinner copy = dinner.deepClone();
        System.out.println(dinner);
        System.out.println(copy);
        System.out.println(dinner.getLemon());
        System.out.println(copy.getLemon());

    }
}

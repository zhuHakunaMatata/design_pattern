package com.my.designpattern.prototype.shallow;

public class SaleOrderTest {
    public static void main(String[] args) {
        SaleOrder saleOrder = new SaleOrder();
        saleOrder.setApple(new Apple());
        System.out.println(saleOrder.getApple());

        try {
            SaleOrder copy = (SaleOrder) saleOrder.clone();
            System.out.println(copy.getApple());
            System.out.println(saleOrder);
            System.out.println(copy);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

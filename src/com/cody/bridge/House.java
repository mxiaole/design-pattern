package com.cody.bridge;

public class House extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产出来房子");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的房子被卖掉");
    }

}
package com.cody.factory;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人的肤色是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话，一般人听不懂");

    }
}

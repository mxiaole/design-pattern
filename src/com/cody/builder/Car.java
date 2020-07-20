package com.cody.builder;

// 玩具车
public class Car extends Toy {

    public Car(String name) {
        super(name);
    }

    @Override
    public void feature() {
        System.out.println("我是" + this.getName() + ", 我可以快速的跑。。。。。。。。");
    }
}

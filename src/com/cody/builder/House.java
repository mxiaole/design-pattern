package com.cody.builder;

// 玩具房子
public class House extends Toy {
    public House(String name) {
        super(name);
    }

    @Override
    public void feature() {
        System.out.println("我是" + this.getName() + ", 我可以让你住。。。。。。。。");
    }
}

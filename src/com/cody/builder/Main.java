package com.cody.builder;

// 建造者模式
public class Main {
    public static void main(String[] args) {
        Toy toy = new Car("奔驰");
        toy.addComponent("给奔驰加轮子");
        toy.feature();

        String name;
        name = "xiaolele";
        System.out.println(name);
    }

}

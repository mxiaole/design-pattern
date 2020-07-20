package com.cody.builder;

import java.util.ArrayList;

/**
 * 对应的是产品
 */
public abstract class Toy {
    private String name; // 玩具的名称
    private ArrayList<String> component;  // 组成玩具的组件

    public Toy(String name) {
        this.name = name;
        component = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    // 给玩具添加组件
    public void addComponent(String cp) {
        component.add(cp);
    }

    public abstract void feature();

}

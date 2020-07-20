package com.cody.decoration;

public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 被装饰
        component = new ConcreteDecorator(component);
        component.operate();
    }
}

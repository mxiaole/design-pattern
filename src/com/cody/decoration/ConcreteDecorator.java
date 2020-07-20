package com.cody.decoration;

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component _component) {
        super(_component);
    }

    private void method1() {
        System.out.println("method1 修饰");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}

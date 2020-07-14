package com.cody.bridge;

public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱。。。。");
    }

}
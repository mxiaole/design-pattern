package com.cody.factory;

public class NvWa {
    public static void main(String[] args) {
        // 创建一个工厂
        AbstractHumanFactory humanFactory = new HumanFactory();
        System.out.println("造出的第一批白色人种");

        // 工厂根据传入的产品创建产品
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}

package com.cody.factory;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        System.out.println("造出的第一批白色人种");
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);

        whiteHuman.getColor();
        whiteHuman.talk();
    }
}

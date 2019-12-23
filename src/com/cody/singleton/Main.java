package com.cody.singleton;


public class Main {

    public static void Emperor1() {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }

    public static void Emperor2() {
        for (int day = 0; day < 3; day++) {
            Emperor2 emperor2 = Emperor2.getInstance();
            emperor2.say();
        }
    }

    public static void MultiEmperor1() {
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            MultiEmperor multiEmperor = MultiEmperor.getInstance();
            multiEmperor.say();
        }

    }

    public static void main(String[] args) {
        Emperor1();
        Emperor2();
        MultiEmperor1();
    }
}

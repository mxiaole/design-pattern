package com.cody.bridge;

class Main {
    public static void main(String args[]) {
        House house = new House();
        System.out.println("房地产公司运行");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        System.out.println("山寨公司运行。。。。。。");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Ipod());
        shanZhaiCorp.makeMoney();

    }
}

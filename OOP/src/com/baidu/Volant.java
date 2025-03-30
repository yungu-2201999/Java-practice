package com.baidu;

public interface Volant {

    int FLY_HIGHT = 100;
    void fly();
}

interface Honest {
    void helpOther();
}

class GoodMan implements  Honest {

    @Override
    public void helpOther() {
        System.out.println("扶老奶奶过马路");
    }
}
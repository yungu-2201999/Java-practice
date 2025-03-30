package com.baidu;

public class Test {
    public static void main(String[] args) {
        TestDefault td = new TestDefaultImpl();
        td.printInfo();
        td.moren();
        System.out.println("------------------------");
        TestDefault.testStatic01();
    }
}

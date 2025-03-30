package com.baidu;

public interface TestDefault {
    void printInfo();

    default void moren(){
        System.out.println("默认方法");
        System.out.println("TestDefault.moren");
    }

    static void testStatic01(){
        System.out.println("TestDefault.testStatic01");
        System.out.println("测试静态方法");
    }
}

class TestDefaultImpl implements  TestDefault {

    @Override
    public void printInfo() {
        System.out.println("打印实现的方法");
        System.out.println("TestDefaultImpl.printInfo");
    }

}
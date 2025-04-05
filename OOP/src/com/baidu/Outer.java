package com.baidu;

public class Outer {
   public void test1(A a){
       a.run();

   }

    public static void main(String[] args) {
       Outer t = new Outer();
    t.test1(
            new A(){
                @Override
                public void run() {
                    System.out.println("Outer.run");
                }
            }
    );
    }
}


interface A{
    void run();
}
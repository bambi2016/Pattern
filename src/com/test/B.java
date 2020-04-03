package com.test;

public class B extends AbstactClass{


    public void fun1(A a){
        a.fun1();
    }
    public void fun2(A a){
        a.fun2();
    }

    @Override
    void fun() {
        try {
            Thread.sleep(2900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        B b = new B();
        b.funct();
    }
}

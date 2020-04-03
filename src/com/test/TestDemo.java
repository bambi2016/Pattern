package com.test;

public class TestDemo {
    public static void main(String[] args){
        System.out.println("hehe");
        TestDemo demo = new TestDemo();
        boolean istrue = demo.istrue(true);
        System.out.println(istrue);
    }
    boolean istrue(boolean b){
        if (istrue(b)!=true){
            return true;
        }
        if (istrue(b)!=true){
            return false;
        }
        return false;
    }
}

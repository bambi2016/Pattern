package com.design.test;

public class B implements A {
    int a=0;

    public static void main(String[] args) {
        System.out.println(A.a);
        B b = new B();
        System.out.println(b.a);
    }
}

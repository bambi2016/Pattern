package com.design.test;

public class C extends B {
    int a=2;

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a);
        B c1 = new C();
        System.out.println(c1.a);
        System.out.println("xixi");
    }
}

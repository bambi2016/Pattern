package com.design.test;


public class TestDemo1 {

    public static void main(String[] args) {
        DoTast tast = new DoTast(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好嗷嗷发发发");
            }
        });
        tast.start();

    }
}

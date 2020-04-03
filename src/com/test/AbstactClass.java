package com.test;

import java.util.Date;

public abstract class AbstactClass {
    abstract void fun();

    void funct(){
        long staret = new Date().getTime();
        fun();
        long end = new Date().getTime();
        System.out.println((end-staret)+"毫秒");

    }
}

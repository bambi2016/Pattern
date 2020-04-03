package com.design.test;

public class DoTast {
    private Runnable target;
    public DoTast(Runnable runnable) {
        target=runnable;
    }

    public void start() {
        target.run();
    }
}

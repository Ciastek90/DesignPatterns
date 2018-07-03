package com.patterns.creational.singleton.Lazy;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(null == INSTANCE){
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }
}

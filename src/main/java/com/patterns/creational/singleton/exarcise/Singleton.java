package com.patterns.creational.singleton.exarcise;

public class Singleton {
    private Singleton instance = null;

    private Singleton (){
    }

    public Singleton getInstance(){
        if (null==instance){
            instance = new Singleton();
        }
        return instance;
    }
}

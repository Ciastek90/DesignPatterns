package com.patterns.operational.decorator;

public class NormalHouse implements House {

    public void Enter() {
        System.out.println("Enter house");
    }

    public void Exit() {
        System.out.println("Exit house");
    }

    public void Sleep() {
        System.out.println("Try sleep house");
    }
}

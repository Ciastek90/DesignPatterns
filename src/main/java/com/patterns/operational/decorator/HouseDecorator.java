package com.patterns.operational.decorator;

public abstract class HouseDecorator implements House {
    private House component;

    protected HouseDecorator(House componentToDecoreate) {
        this.component = componentToDecoreate;
    }

    public void Enter() {
        System.out.println("You not knock to door");
        this.component.Enter();
    }

    public void Exit() {
        this.component.Exit();
        System.out.println("You not closed the door");
    }

    public void Sleep() {
        System.out.println("You try to find bed");
    }
}

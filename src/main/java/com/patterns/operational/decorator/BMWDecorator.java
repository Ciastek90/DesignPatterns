package com.patterns.operational.decorator;

public abstract class BMWDecorator implements Car{
    private final Car component;

    protected BMWDecorator(Car component) {
        this.component = component;
    }

    public void Drive() {
        this.component.Drive();
        System.out.println("I leci w nim wieśniacka muzyka");
    }

    public void Destroy() {
        this.Turn();
        System.out.println("I miałem wypadek");
        this.component.Destroy();
    }

    public void Enter() {
        this.component.Enter();
        System.out.println("I ktoś jest w bagażniku");
    }

    public void Turn(){
        System.out.println("Nie włączyłem kierunkowskazu bo nie ma");
    }
}

package com.patterns.operational.decorator;

public class TIR extends BMWDecorator {
    public TIR(Car component) {
        super(component);
    }

    public void Charge(){
        System.out.println("Załadowałeś tira");
    }
}

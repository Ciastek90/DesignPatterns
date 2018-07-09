package com.patterns.creational.prototype;

public class ConcretePrototype1 extends Prototype<ConcretePrototype1> {

    public ConcretePrototype1 cloneSelf() throws CloneNotSupportedException {
        return (ConcretePrototype1) this.clone();
    }
}

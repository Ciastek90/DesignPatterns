package com.patterns.creational.prototype;

public class CreatePrototype2 extends Prototype<CreatePrototype2> {
    public CreatePrototype2 cloneSelf() throws CloneNotSupportedException {
        return (CreatePrototype2) this.clone();
    }
}

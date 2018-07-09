package com.patterns.creational.builder.exercise;

public class ConcreteBuilder implements Builder {

    public void Buildpart() {

    }

    public Product getResult(){
        return new Product();
    }

}

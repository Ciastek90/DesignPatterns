package com.patterns.creational.factory.standard;

import com.patterns.creational.factory.ProductA;
import com.patterns.creational.factory.ProductB;

public class Factory1 extends AbstractFactory{
    ProductA createProductA() {
        return new ProductA1();
    }

    ProductB createProductB() {
        return new ProductB1();
    }
}

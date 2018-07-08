package com.patterns.creational.factory.standard;

import com.patterns.creational.factory.ProductA;
import com.patterns.creational.factory.ProductB;

public class Factory2 extends AbstractFactory{
    ProductA createProductA() {
        return new ProductA2();
    }

    ProductB createProductB() {
        return new ProductB2();
    }
}

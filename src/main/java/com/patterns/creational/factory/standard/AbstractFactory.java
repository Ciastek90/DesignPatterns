package com.patterns.creational.factory.standard;

import com.patterns.creational.factory.ProductA;
import com.patterns.creational.factory.ProductB;

public abstract class AbstractFactory {
    abstract ProductA createProductA();
    abstract ProductB createProductB();
}

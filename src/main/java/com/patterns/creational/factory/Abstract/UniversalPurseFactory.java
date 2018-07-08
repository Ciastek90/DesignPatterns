package com.patterns.creational.factory.Abstract;

import com.patterns.creational.factory.standard.PurseFactory;
import com.patterns.creational.factory.standard.PurseTypeFactory;

public class UniversalPurseFactory implements OneFactory {
    public PurseTypeFactory get() {
        return new PurseFactory();
    }
}

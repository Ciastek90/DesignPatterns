package com.patterns.creational.factory.Abstract;

import com.patterns.creational.builder.Car;
import com.patterns.creational.factory.enums.PartOfYear;
import com.patterns.creational.factory.standard.AudiFactory;
import com.patterns.creational.factory.standard.MonthFactory;

public class PolishFactory implements UniversalFactory<MonthFactory<Car>>{
    public MonthFactory<Car> get(PartOfYear partOfYear) {
        switch (partOfYear){
            case Spring:
                return new AudiFactory();
            case Summer:
                return new BmwFactory();
            case Autum:
                return new ChevroletFactory();
            case Winter:
                return new CitroenFactory();
        }

        return null;
    }
}

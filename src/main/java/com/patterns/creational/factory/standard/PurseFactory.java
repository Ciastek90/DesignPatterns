package com.patterns.creational.factory.standard;

import com.patterns.creational.builder.enums.Color;
import com.patterns.creational.factory.enums.PurseType;

public class PurseFactory implements PurseTypeFactory {
    public Purse get(PurseType type) {
        switch (type){
            case Versacze:
            case Channel:
            case Abdibas:
            case Pumba:
            case Wittchen:
            case Prada:
                return new Purse(Color.Red,
                        type.toString(),
                        "Cotton");

        }

        return null;
    }
}

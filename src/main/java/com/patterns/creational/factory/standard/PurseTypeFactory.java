package com.patterns.creational.factory.standard;

import com.patterns.creational.factory.enums.PurseType;

public interface PurseTypeFactory {
    Purse get(PurseType type);
}

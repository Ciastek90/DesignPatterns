package com.patterns.creational.factory.Abstract;

import com.patterns.creational.factory.enums.PartOfYear;

public interface UniversalFactory<T> {
    T get(PartOfYear partOfYear);
}

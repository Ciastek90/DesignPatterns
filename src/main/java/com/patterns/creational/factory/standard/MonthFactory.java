package com.patterns.creational.factory.standard;

import com.patterns.creational.factory.enums.Month;

public interface MonthFactory<T> {
    T get(Month month);
}

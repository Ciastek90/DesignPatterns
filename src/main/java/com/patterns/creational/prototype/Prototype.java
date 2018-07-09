package com.patterns.creational.prototype;

public abstract class  Prototype<T> {

    public abstract T cloneSelf() throws CloneNotSupportedException;
}

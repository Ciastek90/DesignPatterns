package com.patterns.operational.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}

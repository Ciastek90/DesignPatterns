package com.patterns.creational.builder.standard;

import com.patterns.creational.builder.Builder;
import com.patterns.creational.builder.enums.Color;
import com.patterns.creational.factory.standard.Purse;

public class PurseBuilder implements Builder<Purse> {
    private final Purse result;

    public PurseBuilder() {
        result = new Purse();
    }

    public PurseBuilder setDefaultPrada(){
        this.setName("Prada");
        this.setColor(Color.Red);
        this.setNameOfMaterial("Cotton");
        return this;
    }

    public Purse build() {
        return result;
    }

    public PurseBuilder setColor(Color color) {
        result.setColor(color);
        return this;
    }

    public PurseBuilder setName(String name){
        result.setName(name);
        return this;
    }

    public PurseBuilder setNameOfMaterial(String nameOfMaterial){
        result.setMaterialName(nameOfMaterial);
        return this;
    }
}

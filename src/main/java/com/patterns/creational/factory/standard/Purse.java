package com.patterns.creational.factory.standard;

import com.patterns.creational.builder.enums.Color;

public class Purse {
    private Color color;
    private String name;
    private String materialName;

    public Purse(){
    }

    public Purse(Color color, String name, String materialName){
        this.color = color;
        this.name = name;
        this.materialName = materialName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}

package com.patterns.operational.bridge;

public class Shape {
    public Shape(Drawing drawer) {
        this.drawer = drawer;
    }

    public void draw() {
        this.drawCircle();
        this.drawLine();

    }

    protected void drawLine() {
        drawer.drawLine();
    }

    protected void drawCircle() {
        drawer.drawCircle();

    }

    private final Drawing drawer;
}

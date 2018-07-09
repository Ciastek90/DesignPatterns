package com.patterns.operational.bridge;

public class V1Drawing extends Drawing{

    public void drawLine() {
        System.out.println("Rysujemy linie w starej wersji.");
    }

    public void drawCircle() {
        System.out.println("Rysujemy kółka w starej wersji.");

    }
}

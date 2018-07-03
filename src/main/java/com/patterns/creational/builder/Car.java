package com.patterns.creational.builder;

import com.patterns.creational.builder.enums.Body;
import com.patterns.creational.builder.enums.Color;
import com.patterns.creational.builder.enums.Drive;
import com.patterns.creational.builder.enums.Mark;

public class Car {
    private final Body body;
    private final Color color;
    private final Drive drive;
    private final Mark mark;

    public Car(Body body, Color color, Drive drive, Mark mark) {
        this.body = body;
        this.color = color;
        this.drive = drive;
        this.mark = mark;
    }

    public String toString() {
        return "\nCar with:" +
                "\n- color: " + this.color.toString() +
                "\n- body: " + this.body.toString() +
                "\n- drive: " + this.drive.toString() +
                "\n- mark: " + this.mark.toString();
    }
}

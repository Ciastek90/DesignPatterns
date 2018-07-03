package com.patterns.creational.builder.standard;

import com.patterns.creational.builder.Builder;
import com.patterns.creational.builder.Car;
import com.patterns.creational.builder.enums.Body;
import com.patterns.creational.builder.enums.Color;
import com.patterns.creational.builder.enums.Drive;
import com.patterns.creational.builder.enums.Mark;

public class CarBuilder implements Builder<Car> {
    private Body body;
    private Color color;
    private Drive drive;
    private Mark mark;

    public void setBody(Body body) {
        this.body = body;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Car build() {
        return new Car(this.body, this.color, this.drive, this.mark);
    }
}

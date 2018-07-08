package com.patterns.creational.builder.fluentApi;

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

    public CarBuilder setBody(Body body) {
        this.body = body;

        return this;
    }

    public CarBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public CarBuilder setDrive(Drive drive) {
        this.drive = drive;
        return this;
    }

    public CarBuilder setMark(Mark mark) {
        this.mark = mark;
        return this;
    }

    public Car build() {
        return new Car(this.body, this.color, this.drive, this.mark);
    }
}

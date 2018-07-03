package com.patterns.creational.factory.Abstract;

import com.patterns.creational.builder.Car;
import com.patterns.creational.builder.enums.Body;
import com.patterns.creational.builder.enums.Color;
import com.patterns.creational.builder.enums.Drive;
import com.patterns.creational.builder.enums.Mark;
import com.patterns.creational.factory.enums.Month;
import com.patterns.creational.factory.standard.MonthFactory;

public class CitroenFactory implements MonthFactory<Car> {
    private static final Mark MARK = Mark.Citroën;

    public Car get(Month month) {
        switch (month) {
            case January:
                return new Car(Body.Crossover, Color.Black, Drive.Diesel, MARK);
            case February:
                return new Car(Body.CertifiedPreOwned, Color.AliceBlue, Drive.Eelectric, MARK);
            case March:
                return new Car(Body.Convertible, Color.AntiqueWhite, Drive.Human, MARK);
            case April:
                return new Car(Body.Coupe, Color.Aquamarine, Drive.Hybrid, MARK);
            case May:
                return new Car(Body.Diesel, Color.Azure, Drive.Hydrogen, MARK);
            case June:
                return new Car(Body.Hybrid, Color.Beige, Drive.Petrol, MARK);
            case July:
                return new Car(Body.Luxury, Color.Bisque, Drive.Diesel, MARK);
            case August:
                return new Car(Body.Sedan, Color.BlanchedAlmond, Drive.Eelectric, MARK);
            case September:
                return new Car(Body.Sport, Color.Blue, Drive.Human, MARK);
            case October:
                return new Car(Body.SUV, Color.BlueViolet, Drive.Hybrid, MARK);
            case November:
                return new Car(Body.Truck, Color.Brown, Drive.Petrol, MARK);
            case December:
                return new Car(Body.Van, Color.Burlywood, Drive.Diesel, MARK);
        }

        return new Car(null,null,null,null);
    }
}

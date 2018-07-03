package com.patterns;

import com.patterns.creational.builder.enums.Body;
import com.patterns.creational.builder.enums.Color;
import com.patterns.creational.builder.enums.Drive;
import com.patterns.creational.builder.enums.Mark;
import com.patterns.creational.builder.Car;
import com.patterns.creational.factory.standard.MonthFactory;
import com.patterns.creational.factory.Abstract.PolishFactory;
import com.patterns.creational.factory.enums.PartOfYear;
import com.patterns.creational.factory.standard.AudiFactory;
import com.patterns.creational.factory.enums.Month;
import com.patterns.creational.singleton.Eager.Example.ExternalMachineConnection;
import com.patterns.creational.singleton.Enum.Example.MemoryConnection;
import com.patterns.creational.singleton.Lazy.Example.SQLConnection;

public class Main {
    public static void main(String[] args) {
        ExternalMachineConnection machineConnection = ExternalMachineConnection.getINSTANCE();
        System.out.print(machineConnection.getData());
        SQLConnection sqlConnection = SQLConnection.getINSTANCE();
        System.out.print(sqlConnection.getData());
        MemoryConnection memoryConnection = MemoryConnection.INSTANCE;
        System.out.print(memoryConnection.getData());

        com.patterns.creational.builder.standard.CarBuilder builder =
                new com.patterns.creational.builder.standard.CarBuilder();
        builder.setBody(Body.Crossover);
        builder.setColor(Color.Black);
        builder.setDrive(Drive.Diesel);
        builder.setMark(Mark.BMW);
        Car bmwX3 = builder.build();
        System.out.print(bmwX3.toString());

        Car bmwX5 = new com.patterns.creational.builder.fluentApi.CarBuilder()
                .setBody(Body.Crossover)
                .setColor(Color.Black)
                .setDrive(Drive.Diesel)
                .setMark(Mark.BMW).build();

        System.out.print(bmwX5.toString());

        Car mayAudi = new AudiFactory().get(Month.May);
        System.out.print(mayAudi.toString());

        MonthFactory<Car> summerFactory = new PolishFactory().get(PartOfYear.Summer);
        Car summerCar = summerFactory.get(Month.January);
        System.out.print(summerCar.toString());


    }
}
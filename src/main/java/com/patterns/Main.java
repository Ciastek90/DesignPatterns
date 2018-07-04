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
import com.patterns.operational.command.*;
import com.patterns.operational.decorator.NormalHouse;
import com.patterns.operational.decorator.Vacant;
import com.patterns.operational.decorator.Villa;

import java.util.Random;

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
        System.out.println(summerCar.toString());

        System.out.println();
        System.out.println("Normal house");
        NormalHouse normalHouse = new NormalHouse();
        normalHouse.Enter();
        normalHouse.Sleep();
        normalHouse.Exit();

        System.out.println();
        System.out.println("Vacant");
        Vacant vacant = new Vacant(normalHouse);
        vacant.Enter();
        vacant.Sleep();
        vacant.Exit();
        vacant.Demolish();

        System.out.println();
        System.out.println("Villa");
        Villa villa = new Villa(normalHouse);
        villa.Enter();
        villa.Sleep();
        villa.Swim();
        villa.Exit();


        System.out.println();
        System.out.println("Explorer star journey");
        Random r = new Random();
        final int CAMP_COUNT = 10;

        ExplorationJournal journal = new ExplorationJournal();
        Explorer explorer = new Explorer();

        for(int campIndex =0; campIndex<CAMP_COUNT;campIndex++) {
            switch (r.nextInt() % 4) {
                case 0:
                    journal.makeNote(new MoveUpCommand(explorer));
                    break;
                case 1:
                    journal.makeNote(new MoveDownCommand(explorer));
                    break;
                case 2:
                    journal.makeNote(new MoveLeftCommand(explorer));
                    break;
                default:
                    journal.makeNote(new MoveRightCommand(explorer));
                    break;
            }
        }

        System.out.println();
        System.out.println("Explorer print his book based on his journal");
        journal.print();
    }
}
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
import com.patterns.operational.visitor.Visitable;
import com.patterns.operational.visitor.WeekendManager;
import com.patterns.operational.visitor.WeekendWallet;
import com.patterns.operational.visitor.utilities.Cinema;
import com.patterns.operational.visitor.utilities.Opera;
import com.patterns.operational.visitor.utilities.Theatre;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Opera opera = new Opera(100,2,"Phantom at the opera");
        Theatre theatre = new Theatre(200,2.5, "Pinokio");
        Cinema cinema = new Cinema(300,3,"Avengers");
        List<Visitable> weekendPlan = new LinkedList<Visitable>();
        weekendPlan.add(opera);
        weekendPlan.add(theatre);
        weekendPlan.add(cinema);
        weekendPlan.add(opera);
        weekendPlan.add(theatre);
        weekendPlan.add(cinema);
        WeekendWallet wallet = new WeekendWallet();
        WeekendManager manager = new WeekendManager(wallet, weekendPlan);
        manager.visitAll();
        System.out.println(manager.getBalance());
    }
}
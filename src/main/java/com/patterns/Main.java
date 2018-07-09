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
import com.patterns.operational.bridge.Shape;
import com.patterns.operational.bridge.V1Drawing;
import com.patterns.operational.bridge.V2Drawing;
import com.patterns.operational.command.*;
import com.patterns.operational.composite.Composite;
import com.patterns.operational.composite.Leaf;
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

        Leaf leaf = new Leaf();
        Composite com = new Composite();
        com.add(leaf);
        com.add(com);

    }
}
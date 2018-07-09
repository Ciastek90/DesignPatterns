package com.patterns.creational.builder.exercise;

public class Director {
  private Builder builder=new ConcreteBuilder();

   void Construct(){
       builder.Buildpart();
       Product product=((ConcreteBuilder)builder).getResult();
   }
}

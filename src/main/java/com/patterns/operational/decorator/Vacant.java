package com.patterns.operational.decorator;

public class Vacant extends HouseDecorator{
    public Vacant(House componentToDecoreate) {
        super(componentToDecoreate);
    }

    @Override
    public void Enter() {
        super.Enter();
        System.out.println("You know that there were no doors. You can't knock to door");
    }

    @Override
    public void Exit() {
        super.Exit();
        System.out.println("You know that there were no doors. You can't close the door");
    }

    @Override
    public void Sleep() {
        super.Sleep();
        System.out.println("You don't want sleep in this type of house");
    }

    public void Demolish(){
        System.out.println("You call to build company and demolish whole house");
    }
}

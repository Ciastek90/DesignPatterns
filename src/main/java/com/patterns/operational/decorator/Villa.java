package com.patterns.operational.decorator;

public class Villa extends HouseDecorator{
    public Villa(House componentToDecoreate) {
        super(componentToDecoreate);
    }

    @Override
    public void Enter() {
        super.Enter();
        System.out.println("You hear favourite song");
    }

    @Override
    public void Exit() {
        super.Exit();
        System.out.println("Door close automatic behind you");
    }

    @Override
    public void Sleep() {
        super.Sleep();
        System.out.println("You find big bed and lay on him. Sleep. House play soft music to wake you up on 7:00 am");
    }

    public void Swim(){
        System.out.println("You have awesome swimming pool. Let's start 'Project X'");
    }
}

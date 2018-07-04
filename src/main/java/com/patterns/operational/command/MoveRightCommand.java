package com.patterns.operational.command;

public class MoveRightCommand implements Command{
    private final Explorer explorer;

    public MoveRightCommand(final Explorer explorer){
        this.explorer = explorer;
    }

    public void execute() {
        this.explorer.moveRight();
    }
}

package com.patterns.operational.command;

public class MoveLeftCommand implements Command {
    private final Explorer explorer;

    public MoveLeftCommand(final Explorer explorer){
        this.explorer = explorer;
    }

    public void execute() {
        this.explorer.moveLeft();
    }
}

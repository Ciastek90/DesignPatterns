package com.patterns.operational.command;

public class MoveUpCommand implements Command {
    private final Explorer explorer;

    public MoveUpCommand(final Explorer explorer){
        this.explorer = explorer;
    }

    public void execute() {
        this.explorer.moveUp();
    }
}

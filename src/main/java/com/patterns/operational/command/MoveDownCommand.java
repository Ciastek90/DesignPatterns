package com.patterns.operational.command;

public class MoveDownCommand implements Command{
    private final Explorer explorer;

    public MoveDownCommand(final Explorer explorer){
        this.explorer = explorer;
    }

    public void execute() {
        this.explorer.moveDown();
    }
}

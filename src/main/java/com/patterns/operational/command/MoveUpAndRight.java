package com.patterns.operational.command;

public class MoveUpAndRight implements Command {
    private final Explorer explorer;

    public MoveUpAndRight(Explorer explorer) {
        this.explorer = explorer;
    }

    public void execute() {
        this.explorer.moveUp();
        this.explorer.moveRight();
    }
}

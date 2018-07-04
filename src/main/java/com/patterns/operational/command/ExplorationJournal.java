package com.patterns.operational.command;

import java.util.ArrayList;
import java.util.List;

public class ExplorationJournal {
    private final List<Command> history;

    public ExplorationJournal(){
        this.history = new ArrayList<Command>();
    }

    public void makeNote(final Command command){
        this.history.add(command);
        command.execute();
    }

    public void print(){
        for (Command command :
                this.history) {
            command.execute();
        }
    }
}

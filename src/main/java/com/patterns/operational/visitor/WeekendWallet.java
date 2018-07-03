package com.patterns.operational.visitor;

import com.patterns.operational.visitor.utilities.Cinema;
import com.patterns.operational.visitor.utilities.Opera;
import com.patterns.operational.visitor.utilities.Theatre;

public class WeekendWallet implements Visitor{
    private double cash;

    public WeekendWallet(){
        cash = 10000.0;
    }

    public void visit(Cinema cinema) {
        cash -= cinema.getTicketPrice();
    }

    public void visit(Opera opera) {
        cash -= opera.getTicketPrice();
    }

    public void visit(Theatre theatre) {
        cash -= theatre.getTicketPrice();
    }

    public double getCash() {
        return cash;
    }
}

package com.patterns.operational.visitor.utilities;

import com.patterns.operational.visitor.Visitable;
import com.patterns.operational.visitor.Visitor;

public class Theatre implements Visitable {
    private double ticketPrice;
    private double spendTimeInHours;

    private String showName;

    public Theatre(double ticketPrice, double spendTimeInHours, String showName){
        this.ticketPrice = ticketPrice;
        this.spendTimeInHours = spendTimeInHours;
        this.showName = showName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public double getSpendTimeInHours() {
        return spendTimeInHours;
    }

    public String getShowName() {
        return showName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

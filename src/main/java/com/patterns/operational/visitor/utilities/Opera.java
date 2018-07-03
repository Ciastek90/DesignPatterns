package com.patterns.operational.visitor.utilities;

import com.patterns.operational.visitor.Visitable;
import com.patterns.operational.visitor.Visitor;

public class Opera implements Visitable {
    private double ticketPrice;
    private double spendTimeInHours;
    private String symphonicOperaName;

    public Opera(double ticketPrice, double spendTimeInHours, String symphonicOperaName){
        this.ticketPrice = ticketPrice;
        this.spendTimeInHours = spendTimeInHours;
        this.symphonicOperaName = symphonicOperaName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public double getSpendTimeInHours() {
        return spendTimeInHours;
    }

    public String getSymphonicOperaName() {
        return symphonicOperaName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

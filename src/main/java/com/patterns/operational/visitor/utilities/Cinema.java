package com.patterns.operational.visitor.utilities;

import com.patterns.operational.visitor.Visitable;
import com.patterns.operational.visitor.Visitor;

public class Cinema implements Visitable {
    private double ticketPrice;
    private double spendTimeInHours;
    private String movieTitle;

    public Cinema(double ticketPrice, double spendTimeInHours, String movieTitle){
        this.ticketPrice = ticketPrice;
        this.spendTimeInHours = spendTimeInHours;
        this.movieTitle = movieTitle;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public double getSpendTimeInHours() {
        return spendTimeInHours;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

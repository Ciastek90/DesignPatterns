package com.patterns.operational.visitor;

import java.util.List;

public class WeekendManager {
    private final List<Visitable> visitsPlan;
    private final WeekendWallet wallet;

    public WeekendManager(WeekendWallet wallet, List<Visitable> visitsPlan) {
        this.visitsPlan = visitsPlan;
        this.wallet = wallet;
    }

    public void visitAll() {
        for (Visitable planElement :
                this.visitsPlan) {
            planElement.accept(wallet);
        }
    }

    public double getBalance(){
        return wallet.getCash();
    }
}
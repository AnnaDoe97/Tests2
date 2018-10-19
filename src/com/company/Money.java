package com.company;

public class Money {
    protected int amount;

    public Money(int amount){
        this.amount = amount;
    }


    public boolean equals(Object other){
        Money money = (Money) other;
        return this.amount == money.amount && this.getClass().equals(money.getClass());
    }

    //    public boolean equals(Object other){
//        Ruble rubles = (Ruble) other;
//        return this.amount == rubles.amount;
//    }
}

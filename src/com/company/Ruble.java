package com.company;

public class Ruble extends Money {
//    private int ruble;
    public int amount;

    public Ruble(int amount){
        super(amount);
        this.amount = amount;
    }

    public Ruble times(int m){

        return new Ruble(this.amount*m);
    }

//    @Override
//    public boolean equals(Object other){
//        Ruble rubles = (Ruble) other;
//        return this.amount == rubles.amount;
//    }
}

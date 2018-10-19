package com.company;

public class Dollar extends Money {

    private int dollors;
    public int amount;

    public Dollar(int amount){
        super(amount);
        this.amount = amount;
    }


    public Dollar times(int m){
//        this.dollors = dollors;
//        this.amount *= dollors;
        return new Dollar(this.amount*m);
    }

//    @Override
//    public boolean equals(Object other){
//        Dollar dollar = (Dollar) other;
//        return this.amount == dollar.amount;
//    }
    
}

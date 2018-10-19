package com.company;

import java.math.BigInteger;

public class JustFactorial {
//    public int value;
    public BigInteger fact;


    public BigInteger factorial(int value){
        fact = BigInteger.valueOf(1);
        for (int i = value; i > 0; i--){
            BigInteger valueBi = BigInteger.valueOf(i);
            fact = fact.multiply(valueBi);
        }
        return fact;
    }
}

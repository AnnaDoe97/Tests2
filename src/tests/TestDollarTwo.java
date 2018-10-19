package tests;

import com.company.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDollarTwo {
    @Test
    public void testDollarTwo(){
        Dollar dollars = new Dollar(5);
        Dollar totalDollars = dollars.times(10);
        assertEquals(50, totalDollars.amount);
        totalDollars = dollars.times(5);

        assertEquals(25, totalDollars.amount);
    }
}


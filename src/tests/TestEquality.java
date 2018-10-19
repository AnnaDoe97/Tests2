package tests;

import com.company.Dollar;
import com.company.Ruble;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEquality {
    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(9)));
    }

    @Test
    public void testEquality4(){
        assertFalse(new Dollar(5).equals(new Ruble(5)));
//        assertTrue(new Dollar(5).equals(new Ruble(5)));
    }
}

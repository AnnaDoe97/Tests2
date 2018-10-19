package tests;

import com.company.Ruble;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRuble {
    @Test
    public void testRuble(){
        Ruble rubles = new Ruble(5);
        assertEquals(new Ruble(50), rubles.times(10));
        assertEquals(new Ruble(25), rubles.times(5));
    }
}

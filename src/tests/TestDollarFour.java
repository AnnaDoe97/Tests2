package tests;
import com.company.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDollarFour {
    @Test
    public  void testDollarFour(){
        Dollar dollar = new Dollar(5);
        assertEquals(new Dollar(50), dollar.times(10));
        assertEquals(new Dollar(25), dollar.times(5));
    }
}

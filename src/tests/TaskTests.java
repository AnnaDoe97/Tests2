package tests;
import com.company.Dollar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTests {
    @Test
    public void testDollar(){
        Dollar dollars = new Dollar(5);
        dollars.times(10);
        assertEquals(50, dollars.amount);
    }
}

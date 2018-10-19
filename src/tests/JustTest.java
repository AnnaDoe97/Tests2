package tests;

//import com.company.Dollar;
import com.company.JustFactorial;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JustTest {
    @Test
    public  void lolTest(){
        JustFactorial lol = new JustFactorial();
        System.out.println(lol.factorial(3));
        System.out.println(lol.factorial(1));
        System.out.println(lol.factorial(10));
        BigInteger valueBi = BigInteger.valueOf(3628800);
        assertEquals(valueBi, lol.factorial(10));
    }
}

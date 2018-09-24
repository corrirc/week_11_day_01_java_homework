import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator javacalculator;

    @Before
    public void setUp() {
        javacalculator = new Calculator();
    }

    @Test
    public void Adds() {
        assertEquals(7, javacalculator.add(4, 3));
    }

    @Test
    public void Subtract() {
        assertEquals(1, javacalculator.subtract(5, 4));
    }

    @Test
    public void Multiply() {
        assertEquals(36, javacalculator.multiply(6, 6));
    }

    @Test
    public void Divide() {
        assertEquals(3, javacalculator.divide(6, 2));
    }

}

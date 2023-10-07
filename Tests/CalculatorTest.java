import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(-1, Calculator.add(2, -3));
        assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Calculator.subtract(5, 3));
        assertEquals(-5, Calculator.subtract(2, 7));
        assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, Calculator.multiply(5, 3));
        assertEquals(0, Calculator.multiply(2, 0));
        assertEquals(-8, Calculator.multiply(2, -4));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, Calculator.divide(5, 2), 0.0001);
        assertEquals(0.0, Calculator.divide(0, 5), 0.0001);
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    @Test
    public void testAbsInt() {
        assertEquals(5, MyMath.abs(5));
        assertEquals(0, MyMath.abs(0));
        assertEquals(100, MyMath.abs(-100));
    }

    @Test
    public void testAbsDouble() {
        assertEquals(3.14, MyMath.abs(3.14), 0.001);
        assertEquals(0.0, MyMath.abs(0.0), 0.001);
        assertEquals(2.5, MyMath.abs(-2.5), 0.001);
    }

    @Test
    public void testAbsFloat() {
        assertEquals(2.5f, MyMath.abs(2.5f), 0.001);
        assertEquals(0.0f, MyMath.abs(0.0f), 0.001);
        assertEquals(3.0f, MyMath.abs(-3.0f), 0.001);
    }

    @Test
    public void testAbsLong() {
        assertEquals(100L, MyMath.abs(100L));
        assertEquals(0L, MyMath.abs(0L));
        assertEquals(999999999999L, MyMath.abs(-999999999999L));
    }

    @Test
    public void testMaxInt() {
        assertEquals(10, MyMath.max(5, 10));
        assertEquals(5, MyMath.max(5, 5));
        assertEquals(-5, MyMath.max(-5, -10));
    }

    @Test
    public void testMaxDouble() {
        assertEquals(3.14, MyMath.max(3.14, 2.71), 0.001);
        assertEquals(2.71, MyMath.max(2.71, 2.71), 0.001);
        assertEquals(-2.5, MyMath.max(-3.0, -2.5), 0.001);
    }

    @Test
    public void testMaxFloat() {
        assertEquals(3.0f, MyMath.max(2.5f, 3.0f), 0.001);
        assertEquals(2.5f, MyMath.max(2.5f, 2.5f), 0.001);
        assertEquals(-2.0f, MyMath.max(-3.0f, -2.0f), 0.001);
    }

    @Test
    public void testMaxLong() {
        assertEquals(200L, MyMath.max(100L, 200L));
        assertEquals(100L, MyMath.max(100L, 100L));
        assertEquals(-10L, MyMath.max(-10L, -20L));
    }

    @Test
    public void testMinInt() {
        assertEquals(5, MyMath.min(5, 10));
        assertEquals(5, MyMath.min(5, 5));
        assertEquals(-10, MyMath.min(-5, -10));
    }

    @Test
    public void testMinDouble() {
        assertEquals(2.71, MyMath.min(3.14, 2.71), 0.001);
        assertEquals(2.71, MyMath.min(2.71, 2.71), 0.001);
        assertEquals(-3.0, MyMath.min(-3.0, -2.5), 0.001);
    }

    @Test
    public void testMinFloat() {
        assertEquals(2.5f, MyMath.min(2.5f, 3.0f), 0.001);
        assertEquals(2.5f, MyMath.min(2.5f, 2.5f), 0.001);
        assertEquals(-3.0f, MyMath.min(-3.0f, -2.0f), 0.001);
    }

    @Test
    public void testMinLong() {
        assertEquals(100L, MyMath.min(100L, 200L));
        assertEquals(100L, MyMath.min(100L, 100L));
        assertEquals(-20L, MyMath.min(-10L, -20L));
    }

    @Test
    public void testPow() {
        assertEquals(8, MyMath.pow(2, 3));
        assertEquals(1, MyMath.pow(5, 0));
        assertEquals(0, MyMath.pow(0, 5));
    }
}

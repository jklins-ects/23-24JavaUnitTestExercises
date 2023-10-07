import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeometryCalculatorTest {

    @Test
    public void testCalculateCircleArea() {
        double radius = 5.0;
        double expectedArea = Math.PI * Math.pow(radius, 2);
        double actualArea = GeometryCalculator.calculateCircleArea(radius);
        assertEquals(expectedArea, actualArea, 0.0001); // Using delta for double comparison
    }

    @Test
    public void testCalculateRectangleArea() {
        double length = 6.0;
        double width = 4.0;
        double expectedArea = length * width;
        double actualArea = GeometryCalculator.calculateRectangleArea(length, width);
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void testCalculateTriangleArea() {
        double base = 5.0;
        double height = 8.0;
        double expectedArea = 0.5 * base * height;
        double actualArea = GeometryCalculator.calculateTriangleArea(base, height);
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void testCalculateVolumeOfSphere() {
        double radius = 3.0;
        double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double actualVolume = GeometryCalculator.calculateVolumeOfSphere(radius);
        assertEquals(expectedVolume, actualVolume, 0.0001);
    }

    @Test
    public void testCalculateRectanglePerimeter() {
        double length = 6.0;
        double width = 4.0;
        double expectedPerimeter = 2 * (length + width);
        double actualPerimeter = GeometryCalculator.calculateRectanglePerimeter(length, width);
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001);
    }

    @Test
    public void testCalculateTrianglePerimeter() {
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;
        double expectedPerimeter = side1 + side2 + side3;
        double actualPerimeter = GeometryCalculator.calculateTrianglePerimeter(side1, side2, side3);
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001);
    }

    @Test
    public void testCalculateCircleCircumference() {
        double radius = 5.0;
        double expectedCircumference = 2 * Math.PI * radius;
        double actualCircumference = GeometryCalculator.calculateCircleCircumference(radius);
        assertEquals(expectedCircumference, actualCircumference, 0.0001);
    }

}
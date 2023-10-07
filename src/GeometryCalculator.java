public class GeometryCalculator {

    // Calculate the area of a circle given its radius
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Calculate the area of a rectangle given its length and width
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Calculate the area of a triangle given its base and height
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Calculate the volume of a sphere given its radius
    public static double calculateVolumeOfSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Calculate the perimeter of a rectangle given its length and width
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Calculate the perimeter of a triangle given its three sides
    public static double calculateTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Calculate the circumference of a circle given its radius
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

}

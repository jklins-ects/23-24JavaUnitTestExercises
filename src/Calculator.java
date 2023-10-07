public class Calculator {

    // Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Divide two numbers
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }
}

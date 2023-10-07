public class MyMath {

    // Absolute value for int
    public static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    // Absolute value for double
    public static double abs(double x) {
        return (x < 0) ? -x : x;
    }

    // Absolute value for float
    public static float abs(float x) {
        return (x < 0) ? -x : x;
    }

    // Absolute value for long
    public static long abs(long x) {
        return (x < 0) ? -x : x;
    }

    // Maximum for int
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    // Maximum for double
    public static double max(double x, double y) {
        return (x > y) ? x : y;
    }

    // Maximum for float
    public static float max(float x, float y) {
        return (x > y) ? x : y;
    }

    // Maximum for long
    public static long max(long x, long y) {
        return (x > y) ? x : y;
    }

    // Minimum for int
    public static int min(int x, int y) {
        return (x < y) ? x : y;
    }

    // Minimum for double
    public static double min(double x, double y) {
        return (x < y) ? x : y;
    }

    // Minimum for float
    public static float min(float x, float y) {
        return (x < y) ? x : y;
    }

    // Minimum for long
    public static long min(long x, long y) {
        return (x < y) ? x : y;
    }

    // Power function for int
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
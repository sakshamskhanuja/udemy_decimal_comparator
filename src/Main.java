public class Main {
    public static void main(String[] args) {
        // Checks if -3.1756 and -3.175 are equal for up till three decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        // Checks if 3.175 and 3.176 are equal for up till three decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

        // Checks if 3.0 and 3.0 are equal for up till three decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

        // Checks if -3.123 and 3.123 are equal for up till three decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    /**
     * Checks whether numbers are equal for up till three decimal places.
     */
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return ((int) (a * 1000) == (int) (b * 1000));
    }
}
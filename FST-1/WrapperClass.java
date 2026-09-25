/**
 * Practical 9:
 * Demonstrates comparison of two Wrapper class variables.
 *
 * <p>
 * This program uses the Integer wrapper class
 * and demonstrates equals() and compareTo() methods.
 * </p>
 */
public class WrapperClass {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Integer wrapper class objects.
        Integer firstNumber = Integer.valueOf(50);
        Integer secondNumber = Integer.valueOf(80);

        /*
         * Display both wrapper class values
         * before performing comparisons.
         */
        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        /**
         * Compare the two Integer objects using
         * the equals() method.
         */
        if (firstNumber.equals(secondNumber)) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Both numbers are not equal.");
        }

        // Compare the two numbers using compareTo().
        int comparisonResult = firstNumber.compareTo(secondNumber);

        /*
         * Check the comparison result to determine
         * whether the first number is equal to,
         * greater than, or smaller than the second number.
         */
        if (comparisonResult == 0) {
            System.out.println("Both numbers are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("First number is greater than second number.");
        } else {
            System.out.println("First number is smaller than second number.");
        }
    }
}

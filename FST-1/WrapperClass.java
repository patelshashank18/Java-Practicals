/**
 * Demonstrates the use of the Integer wrapper class
 * and its equals() and compareTo() methods.
 */
public class WrapperClass {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Creates Wrapper class objects.
         */
        Integer firstNumber = Integer.valueOf(50);
        Integer secondNumber = Integer.valueOf(80);

        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        /**
         * Uses the equals() method to compare the two numbers.
         */
        if (firstNumber.equals(secondNumber)) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Both numbers are not equal.");
        }

        /**
         * Uses the compareTo() method to compare the two numbers.
         */
        int comparisonResult = firstNumber.compareTo(secondNumber);

        if (comparisonResult == 0) {
            System.out.println("Both numbers are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("First number is greater than second number.");
        } else {
            System.out.println("First number is smaller than second number.");
        }
    }
}
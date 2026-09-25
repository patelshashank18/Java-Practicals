/**
 * Practical 10A:
 * Demonstrates the difference between == and equals()
 * using String, Integer, and BigDecimal objects.
 */

import java.util.Scanner;

/**
 * Demonstrates object comparison using == and equals().
 */
public class BigDecimal {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a Scanner object to take user input.
        Scanner sc = new Scanner(System.in);

        /*
         * Read two String values from the user
         * for comparison.
         */
        System.out.print("Enter first String: ");
        String firstString = sc.nextLine();

        System.out.print("Enter second String: ");
        String secondString = sc.nextLine();

        /**
         * Compare String objects using == and equals().
         */
        System.out.println("\nString Comparison:");
        System.out.println("Using ==       : " + (firstString == secondString));
        System.out.println("Using equals() : " + firstString.equals(secondString));

        // Read two Integer values from the user.
        System.out.print("\nEnter first Integer: ");
        Integer firstInteger = sc.nextInt();

        System.out.print("Enter second Integer: ");
        Integer secondInteger = sc.nextInt();

        /*
         * Compare Integer objects using
         * == and equals() methods.
         */
        System.out.println("\nInteger Comparison:");
        System.out.println("Using ==       : " + (firstInteger == secondInteger));
        System.out.println("Using equals() : " + firstInteger.equals(secondInteger));

        /**
         * Read two BigDecimal values from the user
         * and compare them using == and equals().
         */
        System.out.print("\nEnter first BigDecimal: ");
        java.math.BigDecimal firstDecimal = sc.nextBigDecimal();

        System.out.print("Enter second BigDecimal: ");
        java.math.BigDecimal secondDecimal = sc.nextBigDecimal();

        // Display the BigDecimal comparison results.
        System.out.println("\nBigDecimal Comparison:");
        System.out.println("Using ==       : " + (firstDecimal == secondDecimal));
        System.out.println("Using equals() : " + firstDecimal.equals(secondDecimal));

        /*
         * Close the Scanner object
         * after all input operations are completed.
         */
        sc.close();
    }
}

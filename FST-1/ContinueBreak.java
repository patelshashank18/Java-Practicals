import java.util.Scanner;

/**
 * Practical 6:
 * Write a program to demonstrate the example of a break/Continue statement.
 *
 */

/**
 * Demonstrates the use of continue and break statements
 * in a for loop.
 */
public class ContinueBreak {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        /*
         * Read the maximum limit and
         * control values for the loop.
         */
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        System.out.print("Enter the number to skip: ");
        int skip = sc.nextInt();

        /**
         * Read the number where the loop
         * should stop.
         */
        System.out.print("Enter the stop number: ");
        int stop = sc.nextInt();

        // Loop from 1 to the given limit.
        for (int i = 1; i <= limit; i++) {

            /*
             * Skip the current iteration when
             * i matches the skip number.
             */
            if (i == skip) {
                continue;
            }

            // Stop the loop when i matches the stop number.
            if (i == stop) {
                break;
            }

            /**
             * Display the current value of i
             * after applying continue and break.
             */
            System.out.println(i);
        }

        /* Close the Scanner object after use. */
        sc.close();
    }
}

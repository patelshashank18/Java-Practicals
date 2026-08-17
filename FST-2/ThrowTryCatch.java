/**
 * Program to demonstrate throw, throws, try-catch, and finally.
 */
import java.util.Scanner;

/**
 * Demonstrates exception handling using throw and throws.
 */
public class ThrowTryCatch {

    /**
     * Checks whether a person is eligible to vote.
     *
     * @param age age of the person
     * @throws Exception if the age is less than 18
     */
    static void checkAge(int age) throws Exception {

        /**
         * Checks if the age is less than 18.
         */
        if (age < 18) {

            /**
             * Manually throws an exception.
             */
            throw new Exception("You are not eligible to vote.");
        }

        System.out.println("You can vote.");
    }

    /**
     * Main method to execute the exception-handling program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Creates a Scanner object to read input from the user.
         */
        Scanner sc = new Scanner(System.in);

        try {

            /**
             * Asks the user to enter their age.
             */
            System.out.print("Enter your age: ");

            /**
             * Reads the age entered by the user.
             */
            int age = sc.nextInt();

            /**
             * Calls the method that uses the throws keyword.
             */
            checkAge(age);
        }

        /**
         * Handles the exception thrown by checkAge().
         */
        catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());
        }

        /**
         * This block always executes whether an exception occurs or not.
         */
        finally {

            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}
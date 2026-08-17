import java.util.Scanner;

/**
 * Searches for a given element in an integer array
 * and displays its index.
 */
public class Arrayelement {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Create a Scanner object to read
         * input from the user.
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Declare and initialize the integer array.
         */
        int[] arr = { 10, 20, 30, 40, 50 };

        /**
         * Ask the user to enter the element
         * that needs to be searched.
         */
        System.out.print("Enter the element to find: ");
        int element = sc.nextInt();

        /**
         * Initialize the index to -1.
         * A value of -1 indicates that the element
         * has not been found.
         */
        int index = -1;

        /**
         * Search for the given element in the array.
         */
        for (int i = 0; i < arr.length; i++) {

            /**
             * Check whether the current array element
             * is equal to the element entered by the user.
             */
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        /**
         * Display the result based on whether
         * the element was found.
         */
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        /**
         * Close the Scanner object.
         */
        sc.close();
    }
}
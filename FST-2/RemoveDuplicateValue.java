import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Demonstrates how to remove duplicate values
 * from an ArrayList using LinkedHashSet.
 */
public class RemoveDuplicateValue {

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
         * Create an ArrayList to store
         * the entered elements.
         */
        ArrayList<String> list = new ArrayList<>();

        /**
         * Ask the user to enter the number
         * of elements.
         */
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        /**
         * Read elements from the user
         * and add them to the ArrayList.
         */
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        /**
         * Display the original list
         * containing duplicate values.
         */
        System.out.println("Original List:");
        System.out.println(list);

        /**
         * Create a LinkedHashSet from the ArrayList.
         * LinkedHashSet removes duplicate values
         * while maintaining insertion order.
         */
        LinkedHashSet<String> set = new LinkedHashSet<>(list);

        /**
         * Display the list after removing
         * duplicate values.
         */
        System.out.println("List after removing duplicates:");
        System.out.println(set);

        /**
         * Close the Scanner object.
         */
        sc.close();
    }
}
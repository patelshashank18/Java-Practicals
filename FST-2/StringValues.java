/**
 * Program to demonstrate storing and displaying String values
 * using ArrayList and Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Demonstrates ArrayList and Iterator with String values.
 */
public class StringValues {

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create an ArrayList to store String values.
        ArrayList<String> list = new ArrayList<>();

        /*
         * Add different String values
         * to the ArrayList.
         */
        list.add("Hello");
        list.add("World");
        list.add("$Jigar");
        list.add("Java");
        list.add("Programming");

        /**
         * Create an Iterator object
         * to traverse the ArrayList.
         */
        Iterator<String> iterator = list.iterator();

        // Display a heading before printing the values.
        System.out.println("String values in the list:");

        /*
         * Continue looping while
         * another element is available.
         */
        while (iterator.hasNext()) {

            /**
             * Retrieve and display the next
             * String value from the Iterator.
             */
            System.out.println(iterator.next());
        }
    }
}

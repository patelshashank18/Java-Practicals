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

        /**
         * Creates an ArrayList to store String values.
         */
        ArrayList<String> list = new ArrayList<>();

        /**
         * Adds String values to the list.
         */
        list.add("Hello");
        list.add("World");
        list.add("$Jigar");
        list.add("Java");
        list.add("Programming");

        /**
         * Creates an Iterator object to traverse the list.
         */
        Iterator<String> iterator = list.iterator();

        /**
         * Prints all String values using Iterator.
         */
        System.out.println("String values in the list:");

        /**
         * Checks whether the iterator has another element.
         */
        while (iterator.hasNext()) {

            /**
             * Retrieves and prints the next String value.
             */
            System.out.println(iterator.next());
        }
    }
}
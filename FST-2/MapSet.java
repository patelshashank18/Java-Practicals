import java.util.HashMap;
import java.util.HashSet;

/**
 * Demonstrates the use of HashMap and HashSet
 * in Java Collections.
 */
public class MapSet {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Create a HashMap to store integer keys
         * and String values.
         */
        HashMap<Integer, String> map = new HashMap<>();

        /**
         * Add key-value pairs to the HashMap.
         */
        map.put(1, "Shashank");
        map.put(2, "Rahul");
        map.put(3, "Amit");

        /**
         * Display the HashMap elements.
         */
        System.out.println("Map Elements:");
        System.out.println(map);

        /**
         * Create a HashSet to store unique String values.
         */
        HashSet<String> set = new HashSet<>();

        /**
         * Add elements to the HashSet.
         */
        set.add("Java");
        set.add("Python");
        set.add("C++");

        /**
         * Add a duplicate value.
         * HashSet does not allow duplicate elements,
         * so the second "Java" is ignored.
         */
        set.add("Java");

        /**
         * Display the HashSet elements.
         */
        System.out.println("\nSet Elements:");
        System.out.println(set);
    }
}
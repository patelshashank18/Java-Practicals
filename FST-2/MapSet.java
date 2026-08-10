import java.util.HashMap;
import java.util.HashSet;

public class MapSet {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Shashank");
        map.put(2, "Rahul");
        map.put(3, "Amit");

        // Display Map values
        System.out.println("Map Elements:");
        System.out.println(map);

        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate value

        // Display Set values
        System.out.println("\nSet Elements:");
        System.out.println(set);
    }
}
import java.util.ArrayList;
import java.util.Iterator;

public class StringValues {
    public static void main(String[] args) {

        // Create an ArrayList of String
        ArrayList<String> list = new ArrayList<>();

        // Add string values to the list
        list.add("Hello");
        list.add("World");
        list.add("Shashank");

        // Create an Iterator
        Iterator<String> itr = list.iterator();
    
        // Print all values using Iterator
        System.out.println("String values are:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
import java.util.ArrayList;
import java.util.Iterator;

public class StringValues {

    public static void main(String[] args) {

        // Create an ArrayList to store String values
        ArrayList<String> list = new ArrayList<>();

        // Add String values to the list
        list.add("Hello");
        list.add("World");
        list.add("$Jigar");
        list.add("Java");
        list.add("Programming");

        // Create Iterator object
        Iterator<String> iterator = list.iterator();

        // Print all values using Iterator
        System.out.println("String values in the list:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
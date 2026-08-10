import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateValue {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Ask user how many elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Read elements
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        // Print original list
        System.out.println("Original List:");
        System.out.println(list);

        // Remove duplicate values
        LinkedHashSet<String> set = new LinkedHashSet<>(list);

        // Print after removing duplicates
        System.out.println("List after removing duplicates:");
        System.out.println(set);

        // Close Scanner
        sc.close();
    }
}
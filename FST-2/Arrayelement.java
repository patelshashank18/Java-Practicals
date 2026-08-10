import java.util.Scanner;

public class Arrayelement {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare and initialize the array
        int[] arr = { 10, 20, 30, 40, 50 };

        // Ask the user to enter the element to search
        System.out.print("Enter the element to find: ");
        int element = sc.nextInt();

        // Variable to store the index
        int index = -1;

        // Search the element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        // Display the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
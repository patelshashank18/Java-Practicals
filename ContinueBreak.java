import java.util.Scanner;

public class ContinueBreak {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the maximum limit for the loop
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        // Read the number to be skipped
        System.out.print("Enter the number to skip: ");
        int skip = sc.nextInt();

        // Read the number where the loop should stop
        System.out.print("Enter the stop number: ");
        int stop = sc.nextInt();

        // Loop from 1 to the given limit
        for (int i = 1; i <= limit; i++) {

            // Skip the current iteration if i equals the skip number
            if (i == skip) {
                continue;
            }

            // Exit the loop if i equals the stop number
            if (i == stop) {
                break;
            }

            // Print the current value of i
            System.out.println(i);
        }

        // Close the Scanner object
        sc.close();
    }
}
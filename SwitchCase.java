import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Display the calculator menu
        System.out.println("=-==== MENU ====-=");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Read the user's menu choice
        System.out.print("Enter your case 3choice (1-4): ");
        int choice = sc.nextInt();

        // Read the first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Read the second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Perform the selected operation using switch-case
        switch (choice) {

            // Perform addition
            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            // Perform subtraction
            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            // Perform multiplication
            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            // Perform division
            case 4:

                // Check for division by zero
                if (b != 0) {
                    System.out.println("Division = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            // Execute if the user enters an invalid choice
            default:
                System.out.println("Invalid choice!");
        }

        // Close the Scanner object
        sc.close();

    }
}
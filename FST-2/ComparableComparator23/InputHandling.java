package ComparableComparator23;

import java.util.Scanner;

/**
 * Demonstrates input handling using Scanner.
 *
 * This class takes student information
 * from the user and displays it.
 */
public class InputHandling {

    /**
     * Takes student name and age from the user.
     */
    public static void demonstrate() {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        /*
         * Takes the student's name as input.
         * nextLine() reads the complete line.
         */
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Takes student age as input
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}

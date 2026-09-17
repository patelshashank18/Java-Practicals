import java.util.Scanner;

/**
 * Demonstrates input handling using Scanner.
 */
public class InputHandling {

    /**
     * Takes student information from the user.
     */
    public static void demonstrate() {

        Scanner scanner = new Scanner(System.in);

        /**
         * Read student name from the user.
         */
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        /**
         * Read student age from the user.
         */
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}
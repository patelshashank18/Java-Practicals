import java.util.Scanner;

/**
 * Demonstrates the use of if, else if, and else statements
 * to classify a person based on their age.
 */
public class IfElse {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        /*
         * Ask the user to enter their age
         * and store the entered value.
         */
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        /**
         * Classify the person based on
         * the entered age.
         */
        if (age < 13) {

            // Display the child category.
            System.out.println("You are a child");

        } else if (age >= 13 && age <= 19) {

            // Display the teenager category.
            System.out.println("You are a teenager");

        } else if (age >= 20 && age <= 60) {

            // Display the adult category.
            System.out.println("You are an adult");

        } else {

            /*
             * Display the senior citizen category
             * when the other conditions are false.
             */
            System.out.println("You are a senior citizen");
        }

        // Close the Scanner object.
        sc.close();
    }
}

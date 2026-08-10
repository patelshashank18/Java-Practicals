import java.util.Scanner;

public class ThrowTryCatch {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        try {
            // Ask the user to enter their age
            System.out.print("Enter your age: ");

            // Read the age entered by the user
            int age = sc.nextInt();

            // Check if the age is less than 18
            if (age < 18) {

                // Manually throw an exception
                throw new Exception("You are not eligible to vote.");
            }

            // This statement executes if age is 18 or above
            System.out.println("You can vote.");
        }

        // Handle the exception
        catch (Exception e) {

            // Print the exception message
            System.out.println(e.getMessage());
        }

        // Close the Scanner object
        sc.close();
    }
}
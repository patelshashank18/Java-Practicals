import java.util.Scanner;

public class ThrowTryCatch {

    // Method uses 'throws' keyword
    static void checkAge(int age) throws Exception {

        // Check if age is less than 18
        if (age < 18) {

            // Manually throw an exception
            throw new Exception("You are not eligible to vote.");
        }

        System.out.println("You can vote.");
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        try {
            // Ask user to enter age
            System.out.print("Enter your age: ");

            // Read age from user
            int age = sc.nextInt();

            // Call method that uses 'throws'
            checkAge(age);
        }

        // Handle exception
        catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());
        }

        // This block always executes
        finally {

            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}
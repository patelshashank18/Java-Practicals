import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Practical 24:
 * Create a text file named myTestFile
 * and write personal details into the file.
 */

/**
 * MyTestFileWrite creates a file and
 * stores personal details in it.
 */
public class MyTestFileWrite {

    /**
     * Main method of the program.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Create the myTestFile
            FileWriter writer = new FileWriter("myTestFile");

            // Take personal details from the user
            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Your City: ");
            String city = sc.nextLine();

            System.out.print("Enter Your Mobile Number: ");
            String mobile = sc.nextLine();

            // Write personal details into the file
            writer.write("Personal Details\n");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("City: " + city + "\n");
            writer.write("Mobile: " + mobile + "\n");

            // Close the FileWriter
            writer.close();

            System.out.println("\nData successfully written to myTestFile");

        } catch (IOException e) {

            // Handle file-related exception
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
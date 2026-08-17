import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Practical 24:
 * Creates a text file named myTestFile
 * and writes personal details into the file.
 */
public class MyTestFileWrite {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Creates a Scanner object to read
         * personal details from the user.
         */
        try (Scanner sc = new Scanner(System.in);
                FileWriter writer = new FileWriter("myTestFile")) {

            /**
             * Reads the name of the user.
             */
            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();

            /**
             * Reads the age of the user.
             */
            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            /**
             * Reads the city of the user.
             */
            System.out.print("Enter Your City: ");
            String city = sc.nextLine();

            /**
             * Reads the mobile number of the user.
             */
            System.out.print("Enter Your Mobile Number: ");
            String mobile = sc.nextLine();

            /**
             * Writes the personal details
             * into the myTestFile.
             */
            writer.write("Personal Details\n");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("City: " + city + "\n");
            writer.write("Mobile: " + mobile + "\n");

            /**
             * Displays a success message after
             * the data has been written successfully.
             */
            System.out.println("\nData successfully written to myTestFile");

        } catch (IOException e) {

            /**
             * Displays an error message if a
             * file-related exception occurs.
             */
            System.out.println("Error: " + e.getMessage());
        }
    }
}
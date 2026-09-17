import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrates basic file handling operations.
 */
public class FileHandling {

    /**
     * Creates, writes and reads a file.
     */
    public static void demonstrate() {

        File file = new File("student.txt");

        try {

            // Create a new file.

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            }

            // Write student information into the file.

            FileWriter writer = new FileWriter(file);

            writer.write("Student Name: Amit\n");
            writer.write("Marks: 85\n");

            writer.close();

            System.out.println("Data written successfully.");

            // Read the contents of the file.

            Scanner scanner = new Scanner(file);

            System.out.println("\nFile Content:");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (IOException e) {

            // Handle file-related exceptions.

            System.out.println("File error: " + e.getMessage());
        }
    }
}

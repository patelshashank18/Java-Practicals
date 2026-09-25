package ComparableComparator23;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrates basic file handling operations.
 *
 * This class creates, writes, and reads a text file.
 */
public class FileHandling {

    /**
     * Creates, writes, and reads a student file.
     */
    public static void demonstrate() {

        // Create a File object
        File file = new File("student.txt");

        try {

            /*
             * Creates a new file if it does not already exist.
             */
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            }

            // Writes student data into the file.
            FileWriter writer = new FileWriter(file);

            writer.write("Student Name: Amit\n");
            writer.write("Marks: 85\n");

            writer.close();

            System.out.println("Data written successfully.");

            /*
             * Reads the contents of the file line by line
             * and displays them on the console.
             */
            Scanner scanner = new Scanner(file);

            System.out.println("\nFile Content:");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (IOException e) {

            // Handles file-related errors.
            System.out.println("File error: " + e.getMessage());
        }
    }
}

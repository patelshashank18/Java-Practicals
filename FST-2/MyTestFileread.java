import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Practical 25:
 * Reads data from myTestFile using File Handling,
 * Input Handling, Loops, String Handling,
 * and Exception Handling.
 */
public class MyTestFileread {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object for user input.
        Scanner sc = new Scanner(System.in);

        // Open myTestFile for reading.
        try (BufferedReader br = new BufferedReader(
                new FileReader("myTestFile"))) {

            // Store each line read from the file.
            String line;

            // Display the heading for file contents.
            System.out.println("File Contents:");
            System.out.println("--------------------");

            // Read the file line by line.
            while ((line = br.readLine()) != null) {

                // Remove leading and trailing spaces.
                line = line.trim();

                // Process the line only if it is not empty.
                if (!line.isEmpty()) {

                    // Convert the line to uppercase.
                    String upperCaseLine = line.toUpperCase();

                    // Convert the line to lowercase.
                    String lowerCaseLine = line.toLowerCase();

                    // Check whether the line contains "name".
                    boolean containsName = lowerCaseLine.contains("name");

                    // Add spaces around the colon.
                    String formattedLine = line.replace(":", " : ");

                    // Display the formatted line.
                    System.out.println(formattedLine);

                    // Display uppercase text when the line contains "name".
                    if (containsName) {
                        System.out.println(
                                "Uppercase: " + upperCaseLine);
                    }
                }
            }

        } catch (IOException e) {

            // Handle file-related exceptions.
            System.out.println("Error: " + e.getMessage());
        }

        // Close the Scanner object.
        sc.close();
    }
}

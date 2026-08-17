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

        /**
         * Creates a Scanner object for user input.
         */
        Scanner sc = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(
                new FileReader("myTestFile"))) {

            /**
             * Stores each line read from the file.
             */
            String line;

            /**
             * Displays the heading for the file contents.
             */
            System.out.println("File Contents:");
            System.out.println("--------------------");

            /**
             * Reads the file line by line until
             * the end of the file is reached.
             */
            while ((line = br.readLine()) != null) {

                /**
                 * Removes leading and trailing spaces
                 * from the current line.
                 */
                line = line.trim();

                /**
                 * Checks whether the line is not empty.
                 */
                if (!line.isEmpty()) {

                    /**
                     * Demonstrates String Handling by
                     * converting the line to uppercase.
                     */
                    String upperCaseLine = line.toUpperCase();

                    /**
                     * Demonstrates String Handling by
                     * converting the line to lowercase.
                     */
                    String lowerCaseLine = line.toLowerCase();

                    /**
                     * Checks whether the line contains
                     * the word "name".
                     */
                    boolean containsName = lowerCaseLine.contains("name");

                    /**
                     * Replaces the colon with " : "
                     * to demonstrate String replacement.
                     */
                    String formattedLine = line.replace(":", " : ");

                    /**
                     * Displays the original and
                     * processed String.
                     */
                    System.out.println(formattedLine);

                    /**
                     * Displays additional String handling
                     * information when the line contains "name".
                     */
                    if (containsName) {
                        System.out.println(
                                "Uppercase: " + upperCaseLine);
                    }
                }
            }

        } catch (IOException e) {

            /**
             * Handles file-related exceptions.
             */
            System.out.println("Error: " + e.getMessage());
        }

        /**
         * Closes the Scanner object.
         */
        sc.close();
    }
}
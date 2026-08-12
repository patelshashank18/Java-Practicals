import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Practical 25:
 * Read data from the myTestFile using
 * File Handling, Input Handling, Loops,
 * String Handling, and Exception Handling.

 */

/**
 * MyTestFileread reads and displays data
 * from the myTestFile.
 */
public class MyTestFileread {

    /**
     * Main method of the program.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Open the myTestFile
            BufferedReader br = new BufferedReader(
                    new FileReader("myTestFile"));

            String line;

            System.out.println("File Contents:");
            System.out.println("--------------------");

            // Read the file line by line
            while ((line = br.readLine()) != null) {

                // String handling using trim()
                line = line.trim();

                if (!line.isEmpty()) {
                    System.out.println(line);
                }
            }

            br.close();

        } catch (IOException e) {

            // Handle file-related exception
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
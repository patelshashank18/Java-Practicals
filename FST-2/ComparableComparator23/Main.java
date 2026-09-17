/**
 * Main class for Practical 23.
 *
 * This program demonstrates:
 * 1. Comparable
 * 2. Comparator
 * 3. Input Handling
 * 4. String Handling
 * 5. File Handling
 */
public class Main {

    /**
     * Main method where program execution starts.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("===== COMPARABLE =====");
        Comparable.demonstrate();

        System.out.println("\n===== COMPARATOR =====");
        Comparator.demonstrate();

        System.out.println("\n===== STRING HANDLING =====");
        StringHandling.demonstrate();

        System.out.println("\n===== FILE HANDLING =====");
        FileHandling.demonstrate();

        // Uncomment the following line to test input handling.

        // InputHandling.demonstrate();
    }
}

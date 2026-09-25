package ComparableComparator23;

/**
 * Main class for Practical 23.
 *
 * Demonstrates:
 * 1. Comparable
 * 2. Comparator
 * 3. Input Handling
 * 4. String Handling
 * 5. File Handling
 */
public class Main {

    /**
     * Main method to execute all practical demonstrations.
     */
    public static void main(String[] args) {

        // Demonstrate Comparable.
        System.out.println("===== COMPARABLE =====");
        Comparable.demonstrate();

        /*
         * Demonstrate Comparator.
         * Students are sorted using different criteria.
         */
        System.out.println("\n===== COMPARATOR =====");
        Comparator.demonstrate();

        // Demonstrate String Handling.
        System.out.println("\n===== STRING HANDLING =====");
        StringHandling.demonstrate();

        /*
         * Demonstrate File Handling.
         * Creates, writes, and reads student.txt.
         */
        System.out.println("\n===== FILE HANDLING =====");
        FileHandling.demonstrate();

        /**
         * Input handling can be executed separately.
         */
        // InputHandling.demonstrate();
    }
}

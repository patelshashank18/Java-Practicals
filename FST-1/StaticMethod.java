/**
 * Practical 12:
 * Demonstrates static methods, variables, and blocks.
 *
 * <p>
 * This program shows how static members
 * are accessed without creating an object.
 * </p>
 */
public class StaticMethod {

    /**
     * Static variable storing the college name.
     */
    static String collegeName = "ABC College";

    /*
     * Static block executes automatically
     * when the class is loaded.
     */
    static {
        System.out.println("Static block is executed.");
    }

    /**
     * Displays the name of the college.
     */
    static void displayCollege() {

        // Display the value of the static variable.
        System.out.println("College Name: " + collegeName);
    }

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Display a message when the main method starts.
        System.out.println("Main method is executed.");

        /*
         * Call the static method directly
         * without creating an object.
         */
        displayCollege();
    }
}

/**
 * Demonstrates the use of static variables,
 * static blocks, and static methods.
 */
public class StaticMethod {

    /**
     * Static variable storing the college name.
     */
    static String collegeName = "ABC College";

    /**
     * Static block that executes when the class is loaded.
     */
    static {
        System.out.println("Static block is executed.");
    }

    /**
     * Static method that displays the college name.
     */
    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("Main method is executed.");

        /**
         * Calls the static displayCollege() method.
         */
        displayCollege();
    }
}
/**
 * Practical 12:
 * Write a program to demonstrate static methods, variables, and blocks.
 *
 * <p>
 * Demonstrates the use of static variables, static blocks,
 * and static methods.
 * </p>
 */
public class StaticMethod {

    /**
     * Static variable storing the college name.
     */
    static String collegeName = "ABC College";

    static {
        System.out.println("Static block is executed.");
    }

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

        displayCollege();
    }

}
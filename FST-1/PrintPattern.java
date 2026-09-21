/**
 * Practical 5:
 * Write a program to demonstrate the example of the 'for' loop
 * and print the below-mentioned pattern.
 *
 * <p>
 * Demonstrates printing a star pattern using nested for loops.
 * </p>
 */
public class PrintPattern {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Outer loop controls the rows.
        for (int i = 1; i <= 5; i++) {

            // Inner loop prints stars.
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line.
            System.out.println();
        }
    }

}
/**
 * Practical 5:
 * Demonstrates the use of the for loop
 * to print a star pattern using nested loops.
 */
public class PrintPattern {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Outer loop controls the number of rows.
        for (int i = 1; i <= 5; i++) {

            /*
             * Inner loop prints stars according
             * to the current row number.
             */
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            /**
             * Move the cursor to the next line
             * after printing each row.
             */
            System.out.println();
        }
    }
}

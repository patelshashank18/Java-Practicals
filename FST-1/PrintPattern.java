/**
 * Demonstrates printing a star pattern using nested loops.
 */
public class PrintPattern {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Outer loop controls the rows.
         */
        for (int i = 1; i <= 5; i++) {

            /**
             * Inner loop prints stars.
             */
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            /**
             * Move to the next line.
             */
            System.out.println();
        }
    }
}
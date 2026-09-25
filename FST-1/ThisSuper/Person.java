package ThisSuper;

/**
 * Main class to demonstrate the use of
 * this and super keywords in Java.
 */
public class ThisSuper {

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a Student object.
        Student s = new Student();

        /*
         * Display a blank line before
         * demonstrating this and super.
         */
        System.out.println();

        /**
         * Call the show() method to demonstrate
         * access to current and parent class variables.
         */
        s.show();

        // Display a blank line for better output formatting.
        System.out.println();

        /*
         * Call the overridden display() method
         * of the Student class.
         */
        s.display();
    }
}

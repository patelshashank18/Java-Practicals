package ThisSuper;

/**
 * Main class to demonstrate the use of this and super keywords.
 */
public class ThisSuper {

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Creates a Student object.
         */
        Student s = new Student();

        System.out.println();

        /**
         * Demonstrates this and super keywords.
         */
        s.show();

        System.out.println();

        /**
         * Calls the overridden display method.
         */
        s.display();
    }
}
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
         * Displays the Student and Person names using this and super.
         */
        s.show();

        System.out.println();

        /**
         * Calls the display() method of Student.
         */
        s.display();
    }
}
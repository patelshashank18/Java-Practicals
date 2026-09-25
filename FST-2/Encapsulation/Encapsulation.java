
/**
 * Demonstrates the concept of encapsulation in Java.
 *
 * Encapsulation means keeping data private
 * and accessing it through getter and setter methods.
 */
public class Encapsulation {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a Student object.
        Student student = new Student();

        /*
         * Set student details using setter methods.
         * The private variables are accessed indirectly.
         */
        student.setStudentName("Rahul");
        student.setStudentAge(20);

        /**
         * Display student details using getter methods.
         */
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Age: " + student.getStudentAge());
    }
}

/**
 * Demonstrates the concept of encapsulation in Java.
 */
public class Encapsulation {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Create a Student object.
         */
        Student student = new Student();

        /**
         * Set student details using setter methods.
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
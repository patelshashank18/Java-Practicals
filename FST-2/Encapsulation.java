/**
 * Represents a Student using encapsulation.
 * The student name and age are private and accessed
 * through getter and setter methods.
 */
class Student {

    /**
     * Stores the name of the student.
     */
    private String studentName;

    /**
     * Stores the age of the student.
     */
    private int studentAge;

    /**
     * Sets the name of the student.
     *
     * @param studentName the name of the student
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Sets the age of the student.
     *
     * @param studentAge the age of the student
     */
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    /**
     * Returns the name of the student.
     *
     * @return the student name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Returns the age of the student.
     *
     * @return the student age
     */
    public int getStudentAge() {
        return studentAge;
    }
}

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
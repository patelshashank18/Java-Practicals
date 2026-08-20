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
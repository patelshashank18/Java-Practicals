package ComparableComparator;

/**
 * Represents a student and implements the Comparable
 * interface to sort students by roll number.
 */
class Student implements Comparable<Student> {

    int rollNo;
    String name;
    int marks;

    /**
     * Constructor to initialize student details.
     *
     * @param rollNo student roll number
     * @param name   student name
     * @param marks  student marks
     */
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    /**
     * Compares students by roll number.
     *
     * @param s student to compare with
     * @return comparison result based on roll number
     */
    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    /**
     * Returns student details.
     *
     * @return roll number, name, and marks
     */
    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}
package ComparableComparator;

/**
 * Represents a student and implements the Comparable
 * interface to sort students by roll number.
 *
 * This class stores roll number, name, and marks.
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

        // Assign values to student variables
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    /*
     * Compares two students using their roll numbers.
     * Students are sorted in ascending order.
     */
    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    // Returns student details as a String.
    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

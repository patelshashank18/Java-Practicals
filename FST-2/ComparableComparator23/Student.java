package ComparableComparator23;

/**
 * Represents a student with an ID, name, and marks.
 *
 * The Comparable interface is used to sort students
 * by their ID.
 */
public class Student implements java.lang.Comparable<Student> {

    private int id;
    private String name;
    private int marks;

    /**
     * Constructor to initialize student details.
     */
    public Student(int id, String name, int marks) {
        // Store student information
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    /*
     * Getter method for student ID.
     */
    public int getId() {
        return id;
    }

    // Getter method for student name
    public String getName() {
        return name;
    }

    // Getter method for student marks
    public int getMarks() {
        return marks;
    }

    /*
     * Comparable compares students by their ID.
     * Integer.compare() returns the sorting result.
     */
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    /**
     * Returns student information as a String.
     */
    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

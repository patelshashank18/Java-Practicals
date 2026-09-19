/**
 * Student class stores student information.
 */
public class Student {

    private int id;
    private String name;
    private int marks;

    /**
     * Constructor to initialize student details.
     *
     * @param id    student ID
     * @param name  student name
     * @param marks student marks
     */
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    /**
     * Returns student ID.
     *
     * @return student ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns student name.
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns student marks.
     *
     * @return student marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * Displays student details.
     */
    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }

}
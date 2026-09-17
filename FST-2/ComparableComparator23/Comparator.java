import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the Comparator interface.
 *
 * Comparator is used to define different sorting orders
 * for the same type of object.
 */
public class Comparator {

    /**
     * Demonstrates sorting students by name and marks.
     */
    public static void demonstrate() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 75));
        students.add(new Student(101, "Amit", 85));
        students.add(new Student(102, "Neha", 90));

        /**
         * Sort students alphabetically by name.
         */
        students.sort(
                java.util.Comparator.comparing(Student::getName));

        System.out.println("Students sorted by Name:");

        for (Student student : students) {
            System.out.println(student);
        }

        /**
         * Sort students by marks in descending order.
         */
        students.sort(
                java.util.Comparator
                        .comparingInt(Student::getMarks)
                        .reversed());

        System.out.println("\nStudents sorted by Marks:");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
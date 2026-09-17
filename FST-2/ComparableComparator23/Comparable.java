import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates sorting objects using the Comparable concept.
 *
 * Comparable is used to define the natural sorting order
 * of objects.
 */
public class Comparable {

    /**
     * Demonstrates sorting students by their ID.
     */
    public static void demonstrate() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 75));
        students.add(new Student(101, "Amit", 85));
        students.add(new Student(102, "Neha", 90));

        // Sort students by ID.

        Collections.sort(students,
                (student1, student2) -> Integer.compare(student1.getId(), student2.getId()));

        System.out.println("Students sorted by ID:");

        // Display the sorted students.

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

package ComparableComparator23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates sorting students using the Comparable interface.
 */
public class Comparable {

    public static void demonstrate() {

        // Create a list to store students
        List<Student> students = new ArrayList<>();

        /*
         * Add student objects to the list.
         * Each student has an ID, name, and marks.
         */
        students.add(new Student(103, "Rahul", 75));
        students.add(new Student(101, "Amit", 85));
        students.add(new Student(102, "Neha", 90));

        // Sort students using Comparable
        Collections.sort(students);

        System.out.println("Students sorted by ID:");

        /*
         * Display each student after sorting.
         */
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Demonstrates the Comparable and Comparator interfaces
 * using student data and different sorting methods.
 */
public class ComparableComparator {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Create an ArrayList to store students.
         */
        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        /**
         * Take student details from the user.
         */
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Roll No, Name and Marks: ");

            int roll = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();

            list.add(new Student(roll, name, marks));
        }

        /**
         * Display the original student list.
         */
        System.out.println("\nOriginal List:");
        System.out.println(list);

        /**
         * Comparable:
         * Sort students by roll number.
         */
        Collections.sort(list);

        System.out.println("\nSorted by Roll Number:");
        System.out.println(list);

        /**
         * Comparator:
         * Sort students by name.
         */
        Collections.sort(list, new NameComparator());

        System.out.println("\nSorted by Name:");
        System.out.println(list);

        /**
         * Comparator:
         * Sort students by marks.
         */
        Collections.sort(list, new MarksComparator());

        System.out.println("\nSorted by Marks:");
        System.out.println(list);

        sc.close();
    }
}
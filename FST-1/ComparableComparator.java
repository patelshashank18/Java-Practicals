import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Student class implementing Comparable.
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
     * Comparable method to sort students by roll number.
     *
     * @param s student to compare with
     * @return comparison result based on roll number
     */
    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    /**
     * Returns student details as a String.
     *
     * @return roll number, name, and marks
     */
    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

/**
 * Comparator class to sort students by name.
 */
class SortByName implements Comparator<Student> {

    /**
     * Compares two students by their names.
     *
     * @param s1 first student
     * @param s2 second student
     * @return comparison result based on student names
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

/**
 * Comparator class to sort students by marks.
 */
class SortByMarks implements Comparator<Student> {

    /**
     * Compares two students by their marks.
     *
     * @param s1 first student
     * @param s2 second student
     * @return comparison result based on student marks
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
}

/**
 * Main class demonstrating Comparable and Comparator.
 */
public class ComparableComparator {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Creates a Scanner object to take
         * student details from the user.
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Creates an ArrayList to store student objects.
         */
        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        /**
         * Reads the details of each student.
         */
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            list.add(new Student(roll, name, marks));
        }

        /**
         * Displays the original student list.
         */
        System.out.println("\nOriginal List:");
        System.out.println(list);

        /**
         * Comparable - Sort by Roll Number.
         */
        Collections.sort(list);
        System.out.println("\nSorted by Roll Number:");
        System.out.println(list);

        /**
         * Comparator - Sort by Name.
         */
        Collections.sort(list, new SortByName());
        System.out.println("\nSorted by Name:");
        System.out.println(list);

        /**
         * Comparator - Sort by Marks.
         */
        Collections.sort(list, new SortByMarks());
        System.out.println("\nSorted by Marks:");
        System.out.println(list);

        /**
         * Closes the Scanner object.
         */
        sc.close();
    }
}
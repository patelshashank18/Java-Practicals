import java.util.*;

/*
 * Practical 23:
 * Demonstrate Comparable and Comparator interfaces
 * using student data and different sorting methods.
 */

/**
 * StudentData represents student information
 * and implements Comparable for default sorting.
 */
class StudentData implements Comparable<StudentData> {

    int rollNo;
    String name;
    int marks;

    /**
     * Constructor to initialize student details.
     */
    StudentData(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Comparable - Sort by Roll Number
    public int compareTo(StudentData s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    // Display student details
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

/*
 * Comparator for sorting students by name.
 */
class NameComparator implements Comparator<StudentData> {

    // Compare student names
    public int compare(StudentData s1, StudentData s2) {
        return s1.name.compareTo(s2.name);
    }
}

/**
 * Comparator for sorting students by marks.
 */
class MarksComparator implements Comparator<StudentData> {

    // Compare student marks
    public int compare(StudentData s1, StudentData s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}

/**
 * Main class demonstrating Comparable and Comparator.
 */
public class ComparableComparator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create ArrayList
        ArrayList<StudentData> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Take student details from the user
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Roll No, Name and Marks: ");

            int roll = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();

            list.add(new StudentData(roll, name, marks));
        }

        System.out.println("\nOriginal List:");
        System.out.println(list);

        // Comparable - Sort by Roll Number
        Collections.sort(list);

        System.out.println("\nSorted by Roll Number:");
        System.out.println(list);

        // Comparator - Sort by Name
        Collections.sort(list, new NameComparator());

        System.out.println("\nSorted by Name:");
        System.out.println(list);

        // Comparator - Sort by Marks
        Collections.sort(list, new MarksComparator());

        System.out.println("\nSorted by Marks:");
        System.out.println(list);

        sc.close();
    }
}
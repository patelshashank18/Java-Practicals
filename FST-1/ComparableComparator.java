import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Student class implementing Comparable
class Student implements Comparable<Student> {

    int rollNo;
    String name;
    int marks;

    // Constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Comparable - Sort by Roll Number
    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    // Display Student details
    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

// Comparator - Sort by Name
class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator - Sort by Marks
class SortByMarks implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
}

public class ComparableComparator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

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

        System.out.println("\nOriginal List:");
        System.out.println(list);

        // Comparable - Sort by Roll Number
        Collections.sort(list);
        System.out.println("\nSorted by Roll Number:");
        System.out.println(list);

        // Comparator - Sort by Name
        Collections.sort(list, new SortByName());
        System.out.println("\nSorted by Name:");
        System.out.println(list);

        // Comparator - Sort by Marks
        Collections.sort(list, new SortByMarks());
        System.out.println("\nSorted by Marks:");
        System.out.println(list);

        sc.close();
    }
}

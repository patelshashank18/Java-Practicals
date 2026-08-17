package ComparableComparator;

//** Student class implements Comparable */
class Student implements Comparable<Student> {

    int rollNo;
    String name;
    int marks;

    //** Constructor to initialize student details */
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    //**  Comparable: Sort students by roll number */
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    //** Display student details *//
    public String toString() {
        return rollNo + " " + name + " " + marks;

    }
}
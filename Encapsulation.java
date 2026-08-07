class Student {

    // Private variables
    private String studentName;
    private int studentAge;

    // Setter method
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Setter method
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    // Getter method
    public String getStudentName() {
        return studentName;
    }

    // Getter method
    public int getStudentAge() {
        return studentAge;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        // Create object
        Student student = new Student();

        // Set values
        student.setStudentName("Rahul");
        student.setStudentAge(20);

        // Display values
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Age: " + student.getStudentAge());
    }
}
/**
 * Child class that extends the Person class.
 * Demonstrates the use of this and super keywords.
 */
class Student extends Person {

    /**
     * Name of the Student object.
     */
    String name = "Rohan";

    /**
     * Constructor of the Student class.
     * Calls the parent class constructor using super().
     */
    Student() {
        super();

        System.out.println("Student Constructor Called");
    }

    /**
     * Displays the difference between this.name and super.name.
     */
    void show() {
        System.out.println("Using this.name : " + this.name);
        System.out.println("Using super.name: " + super.name);
    }

    /**
     * Calls the parent class display() method using super.display().
     * Then displays the Student name using this.name.
     */
    void display() {
        super.display();

        System.out.println("Student Name: " + this.name);
    }
}
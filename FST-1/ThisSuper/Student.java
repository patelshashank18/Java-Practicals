package ThisSuper;

/**
 * Child class that extends the Person class.
 * Demonstrates the use of this and super keywords.
 */
class Student extends Person {

    String name = "Rohan";

    Student() {
        super();

        System.out.println("Student Constructor Called");
    }

    void show() {
        System.out.println("Using this.name : " + this.name);
        System.out.println("Using super.name: " + super.name);
    }

    void display() {
        super.display();

        System.out.println("Student Name: " + this.name);
    }
}
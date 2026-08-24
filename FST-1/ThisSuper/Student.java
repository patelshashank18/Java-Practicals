package ThisSuper;

/**
 * Child class that extends the Person class.
 * Demonstrates the use of this and super keywords.
 */
class Student extends Person {

    String name = "Rohan";

    /**
     * Student class constructor.
     */
    Student() {
        super();

        System.out.println("Student Constructor Called");
    }

    /**
     * Demonstrates this and super keywords.
     */
    void show() {
        System.out.println("Using this.name: " + this.name);
        System.out.println("Using super.name: " + super.name);
    }

    /**
     * Overrides the parent display method.
     */
    @Override
    void display() {
        super.display();

        System.out.println("Student Name: " + this.name);
    }
}
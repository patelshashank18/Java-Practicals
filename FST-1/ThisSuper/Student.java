package ThisSuper;

/**
 * Child class that extends the Person class.
 *
 * <p>
 * Demonstrates the use of this and super keywords.
 * </p>
 */
class Student extends Person {

    // Stores the name of the Student object.
    String name = "Rohan";

    /**
     * Student class constructor.
     *
     * <p>
     * Calls the parent class constructor using super().
     * </p>
     */
    Student() {

        // Call the constructor of the parent class.
        super();

        /*
         * Display a message after the parent
         * constructor has been executed.
         */
        System.out.println("Student Constructor Called");
    }

    /**
     * Demonstrates access to variables
     * using this and super keywords.
     */
    void show() {

        // Access the current class variable using this.
        System.out.println("Using this.name: " + this.name);

        /**
         * Access the parent class variable
         * using the super keyword.
         */
        System.out.println("Using super.name: " + super.name);
    }

    /**
     * Overrides the display() method of the parent class.
     */
    @Override
    void display() {

        // Call the parent class display() method.
        super.display();

        /*
         * Display the Student class name
         * using the this keyword.
         */
        System.out.println("Student Name: " + this.name);
    }
}

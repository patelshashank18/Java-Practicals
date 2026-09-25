package ThisSuper;

/**
 * Parent class for the Student class.
 *
 * <p>
 * Demonstrates inheritance and the use of
 * the super keyword in the child class.
 * </p>
 */
class Person {

    // Stores the name of the parent class object.
    String name = "Jigar";

    /**
     * Parent class constructor.
     */
    Person() {

        // Display a message when the constructor is called.
        System.out.println("Person Constructor Called");
    }

    /**
     * Displays the name stored in the Person class.
     */
    void display() {

        /*
         * Display the parent class name
         * using the instance variable.
         */
        System.out.println("Person Name: " + name);
    }
}

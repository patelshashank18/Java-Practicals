package ThisSuper;

/**
 * Parent class for the Student class.
 * Demonstrates inheritance and the super keyword.
 */
class Person {

    String name = "Jigar";

    /**
     * Parent class constructor.
     */
    Person() {
        System.out.println("Person Constructor Called");
    }

    /**
     * Displays the parent class name.
     */
    void display() {
        System.out.println("Person Name: " + name);
    }
}
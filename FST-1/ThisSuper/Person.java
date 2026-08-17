/**
 * Parent class for the Student class.
 * Demonstrates inheritance and the super keyword.
 */
class Person {

    /**
     * Name of the Person object.
     */
    String name = "Jigar";

    /**
     * Constructor of the Person class.
     */
    Person() {
        System.out.println("Person Constructor Called");
    }

    /**
     * Displays the Person name.
     */
    void display() {
        System.out.println("Person Name: " + name);
    }
}
Package ThisSuper;
/**
 * Parent class for the Student class.
 * Demonstrates inheritance and the super keyword.
 */
class Person {

    String name = "Jigar";

    Person() {
        System.out.println("Person Constructor Called");
    }

    void display() {
        System.out.println("Person Name: " + name);
    }
}
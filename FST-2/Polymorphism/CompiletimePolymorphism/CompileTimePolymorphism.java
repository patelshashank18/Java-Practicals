package Polymorphism.CompiletimePolymorphism;

/**
 * Demonstrates compile-time polymorphism.
 *
 * This program uses method overloading
 * to demonstrate compile-time polymorphism.
 */
public class CompileTimePolymorphism {

    /*
     * Main method demonstrates
     * method overloading.
     */
    public static void main(String[] args) {

        // Create a Calculator object.
        Calculator c = new Calculator();

        /*
         * Calls the overloaded add() methods
         * with different numbers of arguments.
         */
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));

        /**
         * Displays the compile-time polymorphism message.
         */
        System.out.println("Compiletime Polymorphism");
    }
}

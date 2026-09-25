package Polymorphism.CompiletimePolymorphism;

/**
 * Class for method overloading.
 *
 * This class demonstrates compile-time polymorphism
 * using multiple add() methods.
 */
class Calculator {

    /*
     * Adds two integer values.
     */
    int add(int a, int b) {

        // Return the sum of two numbers
        return a + b;
    }

    /**
     * Adds three integer values.
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return sum of three numbers
     */
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

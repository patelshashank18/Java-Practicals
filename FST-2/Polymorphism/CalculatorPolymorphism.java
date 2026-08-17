package Polymorphism;

/**
 * Demonstrates compile-time polymorphism using method overloading.
 */
class CalculatorPolymorphism {

    /**
     * Adds two integer values.
     *
     * @param a first integer
     * @param b second integer
     * @return sum of the two integers
     */
    int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds three integer values.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return sum of the three integers
     */
    int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Adds two double values.
     *
     * @param a first double value
     * @param b second double value
     * @return sum of the two double values
     */
    double add(double a, double b) {
        return a + b;
    }
}
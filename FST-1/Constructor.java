/**
 * Demonstrates default and parameterized constructors
 * using two integer values.
 */
public class Constructor {

    int num1, num2;

    /**
     * Default constructor initializes both numbers to zero.
     */
    Constructor() {
        num1 = 0;
        num2 = 0;
        System.out.println("Default Constructor Called");
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
    }

    /**
     * Parameterized constructor initializes the numbers
     * using the values passed as arguments.
     *
     * @param a first number
     * @param b second number
     */
    Constructor(int a, int b) {
        num1 = a;
        num2 = b;
        System.out.println("\nParameterized Constructor Called");
    }

    /**
     * Displays both numbers and their sum.
     */
    void display() {
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Sum = " + (num1 + num2));
    }

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Creates an object using the default constructor.
         */
        Constructor obj1 = new Constructor();

        /**
         * Creates an object using the parameterized constructor.
         */
        Constructor obj2 = new Constructor(20, 30);
        obj2.display();
    }
}
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

        // Initialize both numbers to zero.
        num1 = 0;
        num2 = 0;

        /*
         * Display the constructor type
         * and initialized values.
         */
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

        // Assign the given values to the instance variables.
        num1 = a;
        num2 = b;

        /*
         * Display a message to indicate
         * that the parameterized constructor was called.
         */
        System.out.println("\nParameterized Constructor Called");
    }

    /**
     * Displays both numbers and their sum.
     */
    void display() {

        // Display the first number.
        System.out.println("Number 1 = " + num1);

        // Display the second number.
        System.out.println("Number 2 = " + num2);

        /**
         * Calculate and display the sum
         * of both numbers.
         */
        System.out.println("Sum = " + (num1 + num2));
    }

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create an object using the default constructor.
        Constructor obj1 = new Constructor();

        /*
         * Create an object using the parameterized constructor
         * and pass two integer values.
         */
        Constructor obj2 = new Constructor(20, 30);

        // Display the numbers and their sum.
        obj2.display();
    }
}

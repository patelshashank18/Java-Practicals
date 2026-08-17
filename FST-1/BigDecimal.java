import java.util.Scanner;

/**
 * Practical 10A:
 * Demonstrates the difference between == and equals()
 * using String, Integer, and BigDecimal objects.
 */
public class BigDecimal {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Creates a Scanner object to take input
         * from the user.
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Reads two String values from the user.
         */
        System.out.print("Enter first String: ");
        String firstString = sc.nextLine();

        System.out.print("Enter second String: ");
        String secondString = sc.nextLine();

        /**
         * Compares String objects using == and equals().
         */
        System.out.println("\nString Comparison:");
        System.out.println("Using ==       : " + (firstString == secondString));
        System.out.println("Using equals() : " + firstString.equals(secondString));

        /**
         * Reads two Integer values from the user.
         */
        System.out.print("\nEnter first Integer: ");
        Integer firstInteger = sc.nextInt();

        System.out.print("Enter second Integer: ");
        Integer secondInteger = sc.nextInt();

        /**
         * Compares Integer objects using == and equals().
         */
        System.out.println("\nInteger Comparison:");
        System.out.println("Using ==       : " + (firstInteger == secondInteger));
        System.out.println("Using equals() : " + firstInteger.equals(secondInteger));

        /**
         * Reads two BigDecimal values from the user.
         */
        System.out.print("\nEnter first BigDecimal: ");
        java.math.BigDecimal firstDecimal = sc.nextBigDecimal();

        System.out.print("Enter second BigDecimal: ");
        java.math.BigDecimal secondDecimal = sc.nextBigDecimal();

        /**
         * Compares BigDecimal objects using == and equals().
         */
        System.out.println("\nBigDecimal Comparison:");
        System.out.println("Using ==       : " + (firstDecimal == secondDecimal));
        System.out.println("Using equals() : " + firstDecimal.equals(secondDecimal));

        /**
         * Closes the Scanner object.
         */
        sc.close();
    }
}
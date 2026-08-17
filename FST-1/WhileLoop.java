import java.util.Scanner;

/**
 * Demonstrates the use of while loop and do-while loop.
 */
public class WhileLoop {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * While Loop.
         */
        System.out.print("Enter a number for while Loop: ");
        int n1 = sc.nextInt();

        int i = 1;

        System.out.println("\nUsing While Loop:");
        while (i <= n1) {
            System.out.println(i);
            i++;
        }

        /**
         * Do-While Loop.
         */
        System.out.print("\nEnter a number for do-while Loop: ");
        int n2 = sc.nextInt();

        int j = 1;

        System.out.println("\nUsing do-while  loop:");
        do {
            System.out.println(j);
            j++;
        } while (j <= n2);

        sc.close();
    }
}
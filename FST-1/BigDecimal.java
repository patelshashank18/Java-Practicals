import java.util.Scanner;

public class BigDecimal {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the first string from the user
        System.out.print("Enter first string: ");
        String firstString = sc.nextLine();

        // Read the second string from the user
        System.out.print("Enter second string: ");
        String secondString = sc.nextLine();

        // Demonstrate charAt() method
        System.out.println("\nUsing charAt() method:");
        System.out.println(firstString.charAt(0));

        // Demonstrate concat() method
        System.out.println("\nUsing concat() method:");
        System.out.println(firstString.concat(secondString));

        // Demonstrate equals() method
        System.out.println("\nUsing equals() method:");
        System.out.println(firstString.equals(secondString));

        // Close Scanner
        sc.close();
    }
}
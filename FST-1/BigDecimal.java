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

        // Compare the two strings using the == operator
        System.out.println("\nUsing == operator:");
        System.out.println(firstString == secondString);

        // Compare the contents of the two strings using equals()
        System.out.println("\nUsing equals() method:");
        System.out.println(firstString.equals(secondString));

        // Close the Scanner object
        sc.close();
    }
}
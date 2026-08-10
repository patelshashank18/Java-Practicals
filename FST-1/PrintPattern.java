import java.util.Scanner;

public class PrintPattern {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the number of rows for the pattern
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop controls the number of columns
            for (int j = 1; j <= i; j++) {

                // Print '*' on the boundary of the triangle
                if (i == 1 || i == n || j == 1 || j == i) {
                    System.out.print("* ");
                }
                // Print spaces inside the hollow triangle
                else {
                    System.out.print("  ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Close the Scanner object
        sc.close();
    }
}
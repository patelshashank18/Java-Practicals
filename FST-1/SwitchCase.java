import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter month number
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        // Find month name using switch-case
        switch (month) {

            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            // If the number is not between 1 and 12
            default:
                System.out.println("Invalid month number!");
        }

        // Close Scanner
        sc.close();
    }
}
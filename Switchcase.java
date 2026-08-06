import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=-==== MENU ====-=");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your case 3choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Division = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    
}
    }


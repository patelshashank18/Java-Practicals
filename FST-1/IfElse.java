import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check if the age is less than 13
        if (age < 13) {
            System.out.println("You are a child");
        }

        // Check if the age is between 13 and 19
        else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager");
        }

        // Check if the age is between 20 and 60
        else if (age >= 20 && age <= 60) {
            System.out.println("You are an adult");
        }

        // If none of the above conditions are true,
        // the person is considered a senior citizen
        else {
            System.out.println("You are a senior citizen");
        }

        // Close the Scanner object
        sc.close();
    }
}
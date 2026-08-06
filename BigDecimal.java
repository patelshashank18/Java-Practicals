import java.util.Scanner;

public class Practical10A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = sc.nextLine();

        System.out.print("Enter second string: ");
        String secondString = sc.nextLine();

        System.out.println("\nUsing == operator:");
        System.out.println(firstString == secondString);

        System.out.println("\nUsing equals() method:");
        System.out.println(firstString.equals(secondString));

        sc.close();
    }
}
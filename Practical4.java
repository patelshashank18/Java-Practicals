import java.util.Scanner;

public class Practical4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // While Loop
        System.out.print("Enter a number for While Loop: ");
        int n1 = sc.nextInt();

        int i = 1;

        System.out.println("\nUsing While Loop:");
        while (i <= n1) {
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        System.out.print("\nEnter a number for Do-While Loop: ");
        int n2 = sc.nextInt();

        int j = 1;

        System.out.println("\nUsing Do-While Loop:");
        do {
            System.out.println(j);
            j++;
        } while (j <= n2);

        sc.close();
    }
}
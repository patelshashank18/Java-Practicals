import java.util.Scanner;

public class practical6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        System.out.print("Enter the number to skip: ");
        int skip = sc.nextInt();

        System.out.print("Enter the stop number: ");
        int stop = sc.nextInt();

        for (int i = 1; i <= limit; i++) {

            if (i == skip) {
                continue;
            }

            if (i == stop) {
                break;
            }

            System.out.println(i);
        }

        sc.close();
    }
}
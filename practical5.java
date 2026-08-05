import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (i == 1 || i == n || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
/* 
Enter number of rows: 9
* 
* * 
*   * 
*     * 
*       * 
*         * 
*           * 
*             * 
* * * * * * * * * 
*/

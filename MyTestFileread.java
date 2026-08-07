import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyTestFileread {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {

            // Open the file
            FileReader fr = new FileReader(fileName);

            // Read the file
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nFile Contents:");
            System.out.println("----------------------");

            // Read line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            br.close();
            fr.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();
    }
}
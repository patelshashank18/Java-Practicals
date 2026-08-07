import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyTestFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Create FileWriter object
            FileWriter writer = new FileWriter("myTestFile.txt");

            // Runtime Input
            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Your City: ");
            String city = sc.nextLine();

            System.out.print("Enter Your Mobile Number: ");
            String mobile = sc.nextLine();

            // Write data into file
            writer.write("Personal Details\n");
            writer.write("------------------------\n");
            writer.write("Name : " + name + "\n");
            writer.write("Age : " + age + "\n");
            writer.write("City : " + city + "\n");
            writer.write("Mobile : " + mobile + "\n");

            // Close FileWriter
            writer.close();

            System.out.println("\nData successfully written to myTestFile.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

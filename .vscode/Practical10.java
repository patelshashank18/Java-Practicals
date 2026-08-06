import java.util.Scanner;

public class Practical10 {

    public static void main(String[] args) {
   String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";

        // 1. charAt()
        System.out.println("1. charAt(1): " + str1.charAt(1));

        // 2. concat()
        System.out.println("2. concat(): " + str1.concat(" " + str2));

        // 3. equals()
        System.out.println("3. equals(): " + str1.equals(str2));

        // 4. equalsIgnoreCase()
        System.out.println("4. equalsIgnoreCase(): " + str1.equalsIgnoreCase(str3));

        // 5. length()
        System.out.println("5. length(): " + str1.length());
    }
}

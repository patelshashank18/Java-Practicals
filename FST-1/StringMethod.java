/**
 * Practical 10:
 * Program to demonstrate String methods.
 */
public class StringMethod {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Java";

        /**
         * charAt() returns the character at the given index.
         */
        System.out.println("charAt(): " + str1.charAt(1));

        /**
         * concat() joins two strings.
         */
        System.out.println("concat(): " + str1.concat(str2));

        /**
         * equals() compares two strings.
         */
        System.out.println("equals(): " + str1.equals(str2));
    }
}
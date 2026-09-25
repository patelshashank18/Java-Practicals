/**
 * Practical 10:
 * Demonstrates various String methods in Java.
 *
 * <p>
 * This program demonstrates commonly used String methods.
 * </p>
 */
public class StringMethod {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create String variables for demonstration.
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Hello Java Programming";

        /*
         * charAt() returns the character
         * at the specified index.
         */
        System.out.println("charAt(): " + str1.charAt(1));

        // concat() joins two strings.
        System.out.println("concat(): " + str1.concat(str2));

        /**
         * equals() compares two strings
         * and returns a boolean result.
         */
        System.out.println("equals(): " + str1.equals(str2));

        // equalsIgnoreCase() compares strings without case sensitivity.
        System.out.println("equalsIgnoreCase(): "
                + str1.equalsIgnoreCase("hello"));

        // length() returns the number of characters.
        System.out.println("length(): " + str1.length());

        /*
         * Convert the strings into uppercase
         * and lowercase formats.
         */
        System.out.println("toUpperCase(): " + str1.toUpperCase());
        System.out.println("toLowerCase(): " + str2.toLowerCase());

        // substring() returns a portion of the string.
        System.out.println("substring(): " + str3.substring(6));

        /**
         * contains() checks whether the specified
         * text exists in the string.
         */
        System.out.println("contains(): " + str3.contains("Java"));

        // startsWith() checks the beginning of the string.
        System.out.println("startsWith(): " + str3.startsWith("Hello"));

        // indexOf() returns the position of the specified text.
        System.out.println("indexOf(): " + str3.indexOf("Programming"));

        /*
         * replace() replaces the specified text
         * with another value.
         */
        System.out.println("replace(): " + str3.replace("Java", "Python"));

        // trim() removes leading and trailing spaces.
        String str4 = "  Hello Java  ";
        System.out.println("trim(): " + str4.trim());

        /**
         * isEmpty() checks whether the string
         * contains no characters.
         */
        String str5 = "";
        System.out.println("isEmpty(): " + str5.isEmpty());
    }
}

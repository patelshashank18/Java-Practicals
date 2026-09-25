package ComparableComparator23;

/**
 * Demonstrates common String handling operations.
 *
 * This class shows different methods
 * used to manipulate and check Strings.
 */
public class StringHandling {

    /**
     * Demonstrates different String methods.
     */
    public static void demonstrate() {

        // Create a String variable
        String text = "Java Programming";

        /*
         * Returns the number of characters
         * present in the String.
         */
        System.out.println("Length: " + text.length());

        // Converts the String into uppercase.
        System.out.println("Uppercase: " + text.toUpperCase());

        /*
         * Converts all characters of the String
         * into lowercase.
         */
        System.out.println("Lowercase: " + text.toLowerCase());

        // Checks whether the String contains "Java".
        System.out.println(
                "Contains Java: " + text.contains("Java"));

        /*
         * Replaces the word "Java" with "Spring"
         * in the given String.
         */
        System.out.println(
                "Replace: " + text.replace("Java", "Spring"));
    }
}

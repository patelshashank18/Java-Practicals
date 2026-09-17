/**
 * Demonstrates common String handling methods.
 */
public class StringHandling {

    /**
     * Demonstrates different String operations.
     */
    public static void demonstrate() {

        String text = "Java Programming";

        // Find the length of the String.

        System.out.println("Length: " + text.length());

        // Convert String into uppercase.

        System.out.println("Uppercase: " + text.toUpperCase());

        // Convert String into lowercase.

        System.out.println("Lowercase: " + text.toLowerCase());

        // Check whether String contains a word.

        System.out.println(
                "Contains Java: " + text.contains("Java"));

        // Replace one word with another.

        System.out.println(
                "Replace: " + text.replace("Java", "Spring"));
    }
}
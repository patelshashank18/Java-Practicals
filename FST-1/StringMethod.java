public class StringMethod {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Hello Java Programming";

        // charAt() returns the character at the given index.
        System.out.println("charAt(): " + str1.charAt(1));

        // concat() joins two strings.
        System.out.println("concat(): " + str1.concat(str2));

        // equals() compares two strings.
        System.out.println("equals(): " + str1.equals(str2));

        // equalsIgnoreCase() compares strings ignoring case.
        System.out.println("equalsIgnoreCase(): "
                + str1.equalsIgnoreCase("hello"));

        // length() returns the number of characters.
        System.out.println("length(): " + str1.length());

        // toUpperCase() converts the string to uppercase.
        System.out.println("toUpperCase(): " + str1.toUpperCase());

        // toLowerCase() converts the string to lowercase.
        System.out.println("toLowerCase(): " + str2.toLowerCase());

        // substring() returns a part of the string.
        System.out.println("substring(): " + str3.substring(6));

        // contains() checks whether a string contains a value.
        System.out.println("contains(): " + str3.contains("Java"));

        // startsWith() checks the starting characters.
        System.out.println("startsWith(): " + str3.startsWith("Hello"));

        // indexOf() returns the index of a character or string.
        System.out.println("indexOf(): " + str3.indexOf("Programming"));

        // replace() replaces characters or text.
        System.out.println("replace(): " + str3.replace("Java", "Python"));

        // trim() removes spaces from the beginning and end.
        String str4 = "  Hello Java  ";
        System.out.println("trim(): " + str4.trim());

        // isEmpty() checks whether the string is empty.
        String str5 = "";
        System.out.println("isEmpty(): " + str5.isEmpty());
    }

}
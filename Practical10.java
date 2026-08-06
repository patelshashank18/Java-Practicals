public class Practical10 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        String str4 = " Java Programming ";

        // 1. charAt()
        System.out.println("charAt(1): " + str1.charAt(1));

        // 2. concat()
        System.out.println("concat(): " + str1.concat(" " + str2));

        // 3. equals()
        System.out.println("equals(): " + str1.equals(str2));

        // 4. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str3));

        // 5. length()
        System.out.println("length(): " + str1.length());
    }
}

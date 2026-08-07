public class StaticMethod {

    // Static variable
    static String collegeName = "ABC College";

    // Static block
    static {
        System.out.println("Static block is executed.");
    }

    // Static method
    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {

        System.out.println("Main method is executed.");

        displayCollege();
    }
}
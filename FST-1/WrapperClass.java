public class WrapperClass {

    public static void main(String[] args) {

        // Creating Wrapper class objects
        Integer firstNumber = Integer.valueOf(50);
        Integer secondNumber = Integer.valueOf(80);

        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Using equals() method
        if (firstNumber.equals(secondNumber)) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Both numbers are not equal.");
        }

        // Using compareTo() method
        int comparisonResult = firstNumber.compareTo(secondNumber);

        if (comparisonResult == 0) {
            System.out.println("Both numbers are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("First number is greater than second number.");
        } else {
            System.out.println("First number is smaller than second number.");
        }
    }
}
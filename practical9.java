public class practical9 {
    public static void main(String[] args) {

        // Creating Wrapper class object
        Integer num1 = Integer.valueOf(50);
        Integer num2 = Integer.valueOf(80);

        System.out.println("First Number : " + num1);
        System.out.println("Second Number: " + num2);

        // Using equals()
        if (num1.equals(num2)) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Both numbers are not equal.");
        }

        // Using compareTo()
        int result = num1.compareTo(num2);

        if (result == 0) {
            System.out.println("num1 and num2 are equal.");
        }
        //result check less than 0
        else if (result > 0) {
            System.out.println("num1 is greater than num2.");
        } else {
            System.out.println("num1 is smaller than num2.");
        }
    }
}
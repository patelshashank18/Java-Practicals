public class Practical7 {

    int num1, num2;
    // no passed parameter its called default constructure 
    // default constructor
    Practical7() {
        num1 = 0;
        num2 = 0;
        System.out.println("Default Constructor Called");
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
    }

    // parameterized constructor
    Practical7(int a, int b) {
        num1 = a;
        num2 = b;
        System.out.println("\nParameterized Constructor Called");
    }

    void display() {
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Sum = " + (num1 + num2));
    }

    public static void main(String[] args) {

        // calling default constructor
        Practical7 obj1 = new Practical7();

        // calling parameterized constructor
        Practical7 obj2 = new Practical7(20, 30);
        obj2.display();
    }
}
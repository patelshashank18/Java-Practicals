class Person {
    String name = "Jigar";

    Person() {
        System.out.println("Person Constructor Called");
    }

    void display() {
        System.out.println("Person Name: " + name);
    }
}

class Student extends Person {
    String name = "Rahul";

    Student() {
        super(); // Calls parent class constructor
        System.out.println("Student Constructor Called");
    }

    void show() {
        System.out.println("Using this.name : " + this.name);
        System.out.println("Using super.name: " + super.name);
    }

    void display() {
        super.display(); // Calls parent class method
        System.out.println("Student Name: " + this.name);
    }
}

public class ThisSuper {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println();

        s.show();

        System.out.println();

        s.display();
    }
}
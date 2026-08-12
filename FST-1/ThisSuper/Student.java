class Student extends Person {
    String name = "Rohan";

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
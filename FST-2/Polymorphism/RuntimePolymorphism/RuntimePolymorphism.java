package Polymorphism.RuntimePolymorphism;

/** Runtime polymorphism */
public class RuntimePolymorphism {
    public static void main(String[] args) {

        /** Parent reference, child object */
        Animal a = new Dog();
        a.sound();
    }
}
package Polymorphism.CompiletimePolymorphism;

/** Compile-time polymorphism */
public class CompileTimePolymorphism {
    public static void main(String[] args) {

        /** Calling overloaded methods */
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
    }
}
package Polymorphism.CompiletimePolymorphism;

/** Class for method overloading */
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
package Polymorphism;
// Child class

class CatPolymorphism extends AnimalPolymorphism {

    // Override parent class method
    @Override
    void sound() {
        System.out.println("Cat says Meow.");
    }
}
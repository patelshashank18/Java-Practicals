// Parent Class
class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }
}

// ------------ Single Inheritance ----------
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking.");
    }
}

// ---------- Multilevel Inheritance ----------
class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

// ---------- Hierarchical Inheritance ----------
class Cat extends Animal {

    void meow() {
        System.out.println("Cat says Meow.");
    }
}

// ---------- Hybrid Inheritance (Using Interface) ----------
interface Pet {

    void play();
}

class PetDog extends Dog implements Pet {

    public void play() {
        System.out.println("Pet Dog is playing.");
    }
}

// ---------- Main Class ----------
public class Inheritance {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("----- Single Inheritance -----");
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        System.out.println("\n----- Multilevel Inheritance -----");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        // Hierarchical Inheritance
        System.out.println("\n----- Hierarchical Inheritance -----");
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Hybrid Inheritance
        System.out.println("\n----- Hybrid Inheritance -----");
        PetDog pd = new PetDog();
        pd.eat();
        pd.bark();
        pd.play();
    }
}
package student;

//Question:
//Create an abstract class called Animal with the following properties and methods:
//
//Properties:
//name (String)
//age (int)
//Methods:
//abstract void makeSound(): This method should be implemented by each subclass of Animal and should print the sound made by the specific animal.
//Create two subclasses of Animal called Dog and Cat. Implement the makeSound() method in each subclass to print the sound made by a dog and a cat, respectively.
//
//In the Main class, create instances of Dog and Cat,

abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 5);

        dog.makeSound();
        cat.makeSound();
    }
}

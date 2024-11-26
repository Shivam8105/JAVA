package oops;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class lec5 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        Animal myDog = new Dog();
        myDog.sound();
    }
}

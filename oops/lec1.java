package oops;

class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println( name + " the dog is walking");
    }

    void bark(){
        System.out.println("His age is " + age + " year and he is barking");
    }

    void sleep(){
        System.out.println("His color is " + color + " and he is sleeping");
    }
}

public class lec1{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Candy";
        d1.age = 1;
        d1.color = "White";

        d1.walk();
        d1.bark();
        d1.sleep();
    }
}
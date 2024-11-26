package oops;

class Animal {
    String name = "Shivam";
}

class Dog extends Animal {
    String name = "Kumar";

    void hello() {
        System.out.println(name);       
        System.out.println(super.name); 
    }
}

public class lec6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.hello(); 
    }
}

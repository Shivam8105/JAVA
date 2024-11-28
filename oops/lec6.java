package oops;

class Animal {
    String name = "Shivam"; // Parent class variable
}

class Kutta extends Animal {
    String name = "Kumar"; // Child class variable

    void hello() {
        System.out.println(name);       // Refers to the child class variable
        System.out.println(super.name); // Refers to the parent class variable
    }
}

public class Lec6 {
    public static void main(String[] args) {
        Kutta dog = new Kutta();
        dog.hello(); 
    }
}

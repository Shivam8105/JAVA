package oops;

class Pen{
    String color;
    String type;
    String brand;
    public void write(){
        System.out.println("Pen is used to write");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printBrand(){
        System.out.println(this.brand);
    }
    public void penType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println("Your name is " + this.name );
        System.out.println("Your age is " + this.age );
    }

}

public class lec1 {
    public static void main(String[] args) {

//! Pen Example
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "BallPoint";
        // pen1.brand = "Reynolds";

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Gel";
        // pen2.brand = "Butterflow"; 

        // pen1.printColor();
        // pen1.penType();
        // pen1.printBrand();

        // pen2.printColor();
        // pen2.penType();
        // pen2.printBrand();
//! Student info

        Student stu1 = new Student();
        stu1.name = "Shivam kumar";
        stu1.age = 20;

        stu1.getInfo();
    }
}

package oops;

//! Accessing of instance variables

// class Example{
//     int value;
//     Example(int value){
//         this.value = value;
//     }

//     void display(){
//         System.out.println("Value: " + this.value);
//     }
// }
// public class lec3 {
//     public static void main(String[] args) {
//         Example obj = new Example(15);
//         obj.display();
//     }
// }


//! Invoke current class methods

// class Example{
//     void methodA(){
//         System.out.println("Method A is called");
//         this.methodB();
//     }
//     void methodB(){
//         System.out.println("Method B is called");
//     }
// }

// public class lec3{
//     public static void main(String[] args) {
//         Example obj = new Example();
//         obj.methodA();
//     }
// }

//! Invoke current class constructor

// class Example{
//     int a,b;
//     Example(){
//         this(5,10);
//     }

//     Example(int a, int b){
//         this.a = a;
//         this.b = b;
//     }

//     void display(){
//         System.out.println("a: " + a + ", b: " + b);
//     }
// }

// public class lec3{
//     public static void main(String[] args) {
//         Example obj = new Example();
//         obj.display();
//     }
// }

//! Chaining Method calls

// class Example{
//     Example method1(){
//         System.out.println("Method 1");
//         return this;
//     }

//     Example method2(){
//         System.out.println("Method 2");
//         return this;
//     }

// }

// public class lec3{
//     public static void main(String[] args) {
//         Example obj = new Example();
//         obj.method1().method2();
//     }
// }


//! Passes the current object as an arguments

class Example{
    void print(Example obj){
        System.out.println("Method is called");
    }

    void callMethod(){
        print(this);
    }
}

public class lec3{
    public static void main(String[] args) {
        Example obj = new Example();
        obj.callMethod();
    }
}

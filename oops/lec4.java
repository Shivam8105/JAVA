package oops;

//! Single inheritance - A class inherits from the another class.
// class Parent{
//     void show(){
//         System.out.println("This is a parent class");
//     }
// }
// class Child extends Parent {
//     void display(){
//         System.out.println("This is a child class");
//     }
// }

// public class lec4 {
//     public static void main(String[] args) {   
//         Child obj = new Child();
//         obj.show();
//         obj.display();
//     }
// }

//! Multilevel inheritance - A class inherits from a class which is already a subclass of another class.

// class GrandParent{
//     void GrandParentMethod(){
//         System.out.println("This is the grand parent method");
//     }
// }

// class Parent extends GrandParent{
//     void ParentMethod(){
//         System.out.println("This is the parent method");
//     }
// }

// class Child extends Parent{
//     void ChildMethod(){
//         System.out.println("This is the child method");
//     }
// }

// public class lec4 {
//     public static void main(String[] args) {
//         Child obj = new Child();
//         obj.GrandParentMethod();
//         obj.ParentMethod();
//         obj.ChildMethod();
//     }
// }

//! Hierarchical - multiple classes inherits from the same parent class.

// class Parent {
//     void ParentMethod(){
//         System.out.println("This is the parent class");
//     }
// }

// class child1 extends Parent{
//     void childMethod(){
//         System.out.println("This is the first child method");
//     }
// }

// class child2 extends Parent{
//     void child2Method(){
//         System.out.println("This is the child 2 method");
//     }
// }

// public class lec4{
//     public static void main(String[] args) {
//         child1 c1 = new child1();
//         c1.ParentMethod();
//         c1.childMethod();

//         child2 c2 = new child2();
//         c2.ParentMethod();
//         c2.child2Method();
//     }
// }
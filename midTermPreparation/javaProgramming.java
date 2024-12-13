package midTermPreparation;

// import LearningJava.stringBuilder;

//! String Builder

// public class javaProgramming{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Bhutiya");
//         System.out.println(sb);
//         System.out.println(sb.charAt(0));
//         sb.setCharAt(0, 'C');
//         System.out.println(sb);
//         sb.insert(7,'p');
//         System.out.println(sb);
//         sb.delete(4, 8);
//         System.out.println(sb);
//     }
// }

//! String Buffer

// import java.util.*;
// public class javaProgramming{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a string to check for the palindrome: ");
//         String input = in.nextLine();
//         StringBuffer sb = new StringBuffer(input);
//         // sb.append(" World");
//         // System.out.println(sb);

//         // sb.insert(6, "Java ");
//         // System.out.println(sb);

//         // sb.replace(6, 10, "Beautiful");
//         // System.out.println(sb);

//         // sb.delete(6, 15);
//         // System.out.println(sb);

//         String reversed = sb.reverse().toString();
//         // System.out.println(reversed);
//         if(input.equals(reversed)){
//             System.out.println("The string is a palindrome");
//         }else{
//             System.out.println("not a palindrome");
//         }
//         in.close();
//     }
// }

//! Encapsulation

// class Person{
//     private String name;
//     private int age;

//     public String getName(){
//         return name;
//     }

//     public void setName(String name){
//         this.name = name;
//     }

//     public int getAge(){
//         return age;
//     }

//     public void setAge(int age){
//         if(age > 0){
//             this.age = age;
//         }
//     }
// }

// public class javaProgramming{
//     public static void main(String[] args) {
//         Person obj = new Person();
//         obj.setName("Shivam Kumar");
//         System.out.println("Name: " + obj.getName());
//         obj.setAge(20);
//         System.out.println("Age: " + obj.getAge());
//     }
// }

//! inheritance

// class Parent{
//     void money(){
//         System.out.println("They are very rich");
//     }
// }

// class son extends Parent{
//     void money_2(){
//         System.out.println("They are dependent of parents for money");
//     }
// }

// class daughter extends Parent{
//     void money_3(){
//         System.out.println("They are also dependent on parents for their money");
//     }
// }

// public class javaProgramming{
//     public static void main(String[] args) {
//         daughter obj1 = new daughter();
//         obj1.money_3();

//         son obj2 = new son();
//         obj2.money_2();
//         obj2.money();
//     }
// }

//! polymorphism 

// class Person{
//     void run(){
//         System.out.println("A person is running");
//     }
// }

// class Man extends Person{
//     @Override
//     void run(){
//         System.out.println("A man is running");
//     }
// }

// public class javaProgramming{
//     public static void main(String[] args) {
//         Man obj = new Man();
//         obj.run();

//         Person obj1 = new Man();
//         obj1.run();

//         Person obj2 = new Person();
//         obj2.run();
//     }
// }

//! Abstraction

// abstract class vehicle{
//     abstract void fuel();
// }

// class Fortuner extends vehicle{
//     void fuel(){
//         System.out.println("It is diesel type. ");
//     }
// }

// public class javaProgramming{
//     public static void main(String[] args) {
//         Fortuner obj = new Fortuner();
//         obj.fuel();
//     }
// }

//! Interface

// interface Animal {
//     void makeSound();

//     void eat();
// }

// class Dog implements Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("bark");
//     }

//     @Override
//     public void eat() {
//         System.out.println("haddi");
//     }
// }

// public class javaProgramming {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.makeSound();
//         dog.eat();
//     }
// }

//! custom Exception

// class insufficientFundsException extends Exception{
//     public insufficientFundsException(String message){
//         super(message);
//     }
// }

// public class javaProgramming{
//     public double balance;
//     public javaProgramming(double balance){
//         this.balance = balance;
//     }

//     public void withdraw(double amount) throws insufficientFundsException{
//         if(amount > balance){
//             throw new insufficientFundsException("insufficient funds for withdrawal");
//         }else{
//             balance -= amount;
//             System.out.println("Withdrawal successful Your new balance: " + balance);
//         }
//     }
//     public static void main(String[] args) {
//         javaProgramming account = new javaProgramming(2000);
//         try{
//             account.withdraw(500);
//         }catch(insufficientFundsException e){
//             System.out.println("Error: " + e.getMessage());
//         }

//     }

// }

//! remove duplicate elements from an array

// import java.util.Arrays;
// import java.util.HashSet;
// public class javaProgramming {
//     public static void main(String[] args) {
//         int[] arr = {2,3,4,3,2,1,4,5,4,6,8,0};

//         int[] result = duplicateRemove(arr);
//         System.out.println("Array: " + Arrays.toString(result));
//     }
//     public static int[] duplicateRemove(int[] arr) {
//         HashSet<Integer> set = new HashSet<>();

//         for(int num : arr) {
//             set.add(num);
//         }

//         int[] uniquearr = new int[set.size()];
//         int i = 0;
//         for(int num : set) {
//             uniquearr[i++] = num;
//         }
//         return uniquearr;
//     }
// }

//! High important questions ques-15

// class Circle{
//     private int radius;

//     public int getRadius(){
//         return radius;
//     }

//     public void setRadius(int radius){
//         this.radius = radius;
//     }

//     public double calculateArea(){
//         return 3.14 * this.radius * this.radius;
//     }

//     public double calculatePerimeter(){
//         return 2 * 3.14 * this.radius;
//     }
// }

// public class javaProgramming{
//     public static void main(String[] args) {
//         Circle obj = new Circle();
//         obj.setRadius(3);
//         double area = obj.calculateArea();
//         double perimeter = obj.calculatePerimeter();

//         System.out.println("Area of the circle: " + area);
//         System.out.println("Perimeter of the circle: " + perimeter);
//     }
// }
package midTermPreparation;

// import java.io.PrintStream;

// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;

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

class Parent{
    void money(){
        System.out.println("They are very rich");
    }
}

class son extends Parent{
    void money_2(){
        System.out.println("They are dependent of parents for money");
    }
}

class daughter extends Parent{
    void money_3(){
        System.out.println("They are also dependent on parents for their money");
    }
}

public class javaProgramming{
    public static void main(String[] args) {
        daughter obj1 = new daughter();
        obj1.money_3();

        son obj2 = new son();
        obj2.money_2();
        obj2.money();
    }
}

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

//! hotel and flight reservation system

// import java.util.ArrayList;
// import java.util.List;

// public class javaProgramming{

//     private List<String> availableflight = new ArrayList<>();
//     private List<String> availablehotal = new ArrayList<>();
//     private List<String> bookingflight = new ArrayList<>();
//     private List<String> bookinghotal = new ArrayList<>();

//     public javaProgramming() {
//         availableflight.add("101, India to Dubai.");
//         availableflight.add("101, India to Dubai.");
//         availableflight.add("101, India to Dubai.");

//         availablehotal.add("HotalA - India");
//         availablehotal.add("HotalB - Dubai");
//         availablehotal.add("HotalC - Londan");
//     }

//     public void SearchFlight() {
//         System.out.println("Available Flight: ");
//         for(String flight : availableflight) {
//             System.out.println("availavle flight: " + flight);
//         }
//     }
//     public void SearchHotal() {
//         System.out.println("Available Hotal: ");
//         for(String hotal : availablehotal) {
//             System.out.println("available hotal: "+ hotal);
//         }
//     }
//     public void bookingflight(String flight) {
//         if(availableflight.contains(flight)) {
//             bookingflight.add(flight);
//             availableflight.remove(flight);
//             System.out.println("Successfully booked flight:" + flight);
//         } else {
//             System.out.println("Not available flight.");
//         }
//     }
//     public void bookinghotal(String hotal) {
//         if(availablehotal.contains(hotal)) {
//             bookinghotal.add(hotal);
//             availablehotal.remove(hotal);
//             System.out.println("Successfully booked hotal:" + hotal);
//         } else {
//             System.out.println("Not available hotal.");
//         }
//     }
//     public void cancelfligh(String flight) {
//         if(bookingflight.contains(flight)) {
//             bookingflight.remove(flight);
//             availableflight.add(flight);
//             System.out.println("Successfully cancel flight: " + flight);
//         } else {
//             System.out.println("No such booking found.");
//         }
//     }
//     public void cancelhotal(String hotal) {
//         if(bookinghotal.contains(hotal)) {
//             bookinghotal.remove(hotal);
//             availablehotal.add(hotal);
//             System.out.println("Successfully canceled. " + hotal);
//         } else {
//             System.out.println("No such booking found.");
//         }
//     }
//     public static void main(String[] args) {
//         javaProgramming travelService = new javaProgramming();

//         travelService.SearchFlight();
//         travelService.SearchHotal();

//         System.out.println("booking are: ");
//         travelService.bookingflight("101, India to Dubai.");
//         travelService.bookinghotal("HotalB - Dubai");

//         System.out.println("canceled arr: ");
//         travelService.cancelfligh("101, India to Dubai.");
//         travelService.cancelhotal("HotalB - Dubai");

//         travelService.SearchFlight();
//         travelService.SearchHotal();
//     }
// }

//! Bank system

// public class javaProgramming {
//     private String depositorName;
//     private String AccountNo;
//     private String AccountType;
//     private double Amount;

//     public javaProgramming(String depositorName, String AccountType, String AccountNo, double Amount) {
//         this.depositorName = depositorName;
//         this.AccountNo = AccountNo;
//         this.AccountType = AccountType;
//         this.Amount = Amount;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             Amount += amount;
//             System.out.println("Amount deposit: " + amount);
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= Amount) {
//             Amount -= amount;
//             System.out.println("Amount withdraw: " + amount);
//         } else {
//             System.out.println("Insuffant amount or invalid withdraw amount.");
//         }
//     }

//     public void display() {
//         System.out.println("depositor Name: " + depositorName);
//         System.out.println("Balance: " + Amount);
//     }

//     public static void main(String[] args) {
//         javaProgramming account = new javaProgramming("ritik", "saving", "20", 5);

//         account.display();

//         account.deposit(5);
//         account.withdraw(3);

//         account.display();
//     }
// }

//! question - 19

// abstract class Employee{
//     private String name;
//     private int id;
//     public Employee(String name, int id){
//         this.name = name;
//         this.id = id;
//     }

//     public String getName(){
//         return name;
//     }

//     public int getId(){
//         return id;
//     }

//     abstract int calculateSalary();
//     abstract void displayInfo();
// }

// class Manager extends Employee{
//     private int basicSalary;
//     private int bonus;

//     public Manager(String name, int id,int basicSalary, int bonus){
//         super(name, bonus);
//         this.basicSalary = basicSalary;
//         this.bonus = bonus;
//     }
//     @Override
//     public int calculateSalary() {
//         return basicSalary + bonus;
//     }

//     @Override
//     public void displayInfo() {
//         System.out.println("Name: " + getName());
//         System.out.println("Id: " + getId());
//         System.out.println("Salary: " + calculateSalary());
//     }
// }

// class Programmer extends Employee{
//     private int hourlyRate;
//     private int hoursWorked;

//     public Programmer(String name,int id, int hourlyRate, int hoursWorked){
//         super(name,id);
//         this.hourlyRate = hourlyRate;
//         this.hoursWorked = hoursWorked;
//     }

//     public double getRate(){
//         return hourlyRate;
//     }

//     public int getHours(){
//         return hoursWorked;
//     }

//     public int calculateSalary(){
//         return hoursWorked * hourlyRate;
//     }

//     public void displayInfo(){
//         System.out.println("Name: " + getName());
//         System.out.println("Id: " + getId());
//         System.out.println("Hourly Rate: " + getRate());
//         System.out.println("Hours Worked: " + getHours());
//     }
// }

// public class javaProgramming{
//     public static void main(String[] args) {
//         Manager person1 = new Manager("Shivam Kumar", 1, 200000000, 200000);
//         person1.displayInfo();
//         person1.calculateSalary();

//         Programmer person2 = new Programmer("Ritik Kumar", 2, 6000, 300);
//         person2.displayInfo();
//         person2.calculateSalary();
//     }
// }

//! all the possible ways to create inner classes

//! Non - static nested class
//! static nested class
//! Local inner class
//! Anonymous inner class

//! non - static nested class

// class Outer{
//     class Inner{
//         void display(){
//             System.out.println("This is a member of inner class");
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Outer hello = new Outer();
//         Outer.Inner hello_2 = hello.new Inner();
//         hello_2.display();
//     }
// }

//! static nested class

// class Outer{
//     static class Inner{
//         void display(){
//             System.out.println("This is a memeber of inner class");
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Outer.Inner hello = new Outer.Inner();
//         hello.display();
//     }
// }


//! Local Inner class

// class Outer{
//     void method(){
//         class Inner{
//             void display(){
//                 System.out.println("This is a local inner class");
//             }
//         }
//         Inner local =  new Inner();
//         local.display();
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Outer hello_2 = new Outer();
//         hello_2.method();
//     }
// }


//! Anonymous Inner class

interface Greeting{
    void sayHello();
}

public class Main{
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello(){
                System.out.println("Hello this is a anonymous inner class");
            }
        };
        greeting.sayHello();
    }
}

//! Exception handling

// public class Main{
//     public static void main(String[] args) throws IOException {
//         throw new IOException(
//             "Input - Output Error"
//         );
//     }
// }


//! Multiple Catch

// public class Main{
//     public static void main(String[] args) {
//         try{
//             int[] arr = new int[5];
//             arr[10] = 50;
//         }catch(ArithmeticException e){
//             System.out.println("Arithmetic exception caught");
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array Index out of Exception");
//         }catch(Exception e){
//             System.out.println("Generic Exception caught");
//         }
//     }
// }

//! custom exception 

// class InvalidAgeException extends Exception{
//     public InvalidAgeException(String message){
//         super(message);
//     }
// }
// public class Main{
//     static void ValidateAge(int age) throws InvalidAgeException{
//         if(age < 18){
//             throw new InvalidAgeException("Not Eligible to Vote");
//         }else{
//             System.out.println(
//                 "Registration Successful"
//             );
//         }
//     }


//     public static void main(String[] args) {
//         try{
//             ValidateAge(16);
//         }catch(InvalidAgeException e){
//             System.out.println("Exception Caught: " + e.getMessage());
//         }try{
//             ValidateAge(20);
//         }catch(InvalidAgeException e){
//             System.out.println("Exception Caught: " + e.getMessage());
//         }
//     }
// }

//! Command-Line Arguments

// public class Main{
//     public static void main(String[] args) {
//         System.out.println("No. of Arguments: " + args.length);
//         for(int i = 0; i < args.length; i++){
//             System.out.println("Argument " + i + " : " + args[i]);
//         }
//     }
// }

//! Implementation of Thread

// class Myrunnable implements Runnable{
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Thread thread = new Thread(new Myrunnable());
//         thread.start();
//     }
// }

//! MultiThreading

// class A extends Thread{
//     public void run(){
//         for(int i = 0; i <= 10; i++){
//             System.out.println("Hi");
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         for(int i = 1; i <= 10; i++){
//             System.out.println("Hello");
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();
//         obj1.start();
//         obj2.start();
//     }
// }

//! Thread Priority

// class A extends Thread{
//     public void run(){
//         for(int i = 1; i <= 10; i++){
//             System.out.println("Hi");
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         for(int i = 1; i < 15; i++){
//             System.out.println("Hello");
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();

//         System.out.println(obj1.getPriority());
//         obj2.setPriority(Thread.MAX_PRIORITY);
//         obj1.start();
//         obj2.start();
//     }
// }

//! Thread Sleep

// class A extends Thread{
//     public void run(){
//         for(int i = 1; i <= 5; i++){
//             System.out.println("Thread running : " + i);
//             try{
//                 Thread.sleep(1000);
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         A obj1 = new A();
//         obj1.start();
//     }
// }

//! Byte Stream

// import java.io.*;
// public class Main {
//     public static void main(String[] args) {
//         try (FileInputStream fis = new FileInputStream("");
//              FileOutputStream fos = new FileOutputStream("")) {

//             int data;
//             while ((data = fis.read()) != -1) {
//                 fos.write(data);
//             }
//             System.out.println("File Copied Successfully");

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

//! Character Stream


// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Main {
//     public static void main(String[] args) {
//         try (FileReader reader = new FileReader("/Users/shivamkumar/Desktop/ByteStream/input.txt");
//              FileWriter writer = new FileWriter("/Users/shivamkumar/Desktop/ByteStream/output.txt")) {

//             int data;

//             while ((data = reader.read()) != -1) {
//                 writer.write(data);
//             }

//             System.out.println("Data copied successfully!");

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

//! object Serialisation

// import java.io.*;

// class Person implements Serializable {
//     private static final long serialVersionUID = 1L; 
//     String name;
//     int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }

// public class Main {
//     public static void main(String[] args) throws ClassNotFoundException {
//         Person person = new Person("Alice", 30);

//         try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
//             out.writeObject(person); 
//             System.out.println("Object serialized successfully!");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))){
//             System.out.println("Deseriallized: " + ois.readObject());
//         }catch(IOException e){
//             e.printStackTrace();
//         }
//     }
// }

//! Creating Stream
// import java.util.Arrays;
// import java.util.List;
// import java.util.*;
// import java.util.stream.Stream;
// public class Main{
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("A","B","C");
//         Stream<String> stream = list.stream();
//         stream.forEach(System.out::println);
//     }
// }


//! Creating a stream Using Array

// import java.util.Arrays;
// import java.util.stream.Stream;

// public class Main {
//     public static void main(String[] args) {
//         String[] array = {"A", "B", "C"};
//         Stream<String> stream = Arrays.stream(array);
//         stream.forEach(System.out::println);
//     }
// }

//! Thread Synchronization

// class Account{
//     private int balance  = 1000;
//     public synchronized void withdraw(int amount){
//         if(balance >= amount){
//             balance -= amount;
//             System.out.println("Withdraw: " + amount + " New Balance: " + balance);
//         }else{
//             System.out.println("Insufficient balance");
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Account obj = new Account();
//         obj.withdraw(550);
//     }
// }

//! Generic classes

// class Box<T>{
//     private T value;
//     public void setValue(T value){
//         this.value = value;
//     }
//     public T getValue(){
//         return value;
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Box<Integer> intBox = new Box();
//         intBox.setValue(10);
//         System.out.println("Integer value: " + intBox.getValue());
//     }
// }

//! Generic Methods

// public class Main{
//     public static <T> void PrintArray(T[] array){
//         for(T element : array){
//             System.out.print(element + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Integer[] intArray = {1,2,3,4,5};
//         String[] strArray = {"Apple", "Banana", "Cherry"};
//         PrintArray(intArray);
//         PrintArray(strArray);
//     }
// }


//! Generic Interfaces

// interface Pair<K,V>{
//     K getKey();
//     V getValue();
// }
// class MyPair <K,V> implements Pair <K,V> {
//     private K key;
//     private V value;
//     public MyPair(K key, V value){
//         this.key = key;
//         this.value = value;
//     }
//     @Override
//     public K getKey(){
//         return key;
//     }
//     @Override
//     public V getValue(){
//         return value;
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Pair <String , Integer> pair = new MyPair("Alice", 25);
//         System.out.println("Key: " + pair.getKey() + " value: " + pair.getValue());
//     }
// }

//! String Buffer

// public class Main {
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("Hello");
//         sb.append(" World");
//         System.out.println("After append: " + sb); 
//         sb.insert(6, "Java ");
//         System.out.println("After insert: " + sb); 
//         sb.replace(6, 10, "Beautiful");
//         System.out.println("After replace: " + sb);
//         sb.delete(6, 15);
//         System.out.println("After delete: " + sb); 
//         sb.reverse();
//         System.out.println("After reverse: " + sb);
//     }
// }


package JavaProgramming;

//! Create a Java class with both static and non-static members. Write a program to call these members from the main method and explain the difference between their behavior.

class Example {
    // Static variable
    static int staticVar = 10;

    // Non-static variable
    int nonStaticVar = 20;

    // Static method
    static void staticMethod() {
        System.out.println("Static method called. Static var: " + staticVar);
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("Non-static method called. Non-static var: " + nonStaticVar);
    }
}

public class StaticNonStaticDemo {
    public static void main(String[] args) {
        // Calling the static method and variable directly using the class name
        Example.staticMethod();
        System.out.println("Accessing static variable: " + Example.staticVar);

        // Creating an object to access non-static members
        Example obj = new Example();
        obj.nonStaticMethod();
        System.out.println("Accessing non-static variable: " + obj.nonStaticVar);
    }
}

// ! Design a Java program that accepts a string as a command-line argument and checks whether it is a palindrome. Use StringBuffer or StringBuilder in your solution

// public class PalindromeChecker {
//     public static void main(String[] args) {
//         // Check if a command-line argument is provided
//         if (args.length == 0) {
//             System.out.println("Please provide a string as a command-line argument.");
//             return;
//         }

//         // Read the input string
//         String input = args[0];

//         // Reverse the string using StringBuilder
//         StringBuilder reversed = new StringBuilder(input).reverse();

//         // Check if the original string is equal to the reversed string
//         if (input.equalsIgnoreCase(reversed.toString())) {
//             System.out.println("The string \"" + input + "\" is a palindrome.");
//         } else {
//             System.out.println("The string \"" + input + "\" is not a palindrome.");
//         }
//     }
// }

// ! . Develop a Java program that creates a user-defined exception to handle invalid input for a specific scenario (e.g., age below 18 for voting). Include a try-catch block to handle the exception.

// // Custom exception class
// class InvalidAgeException extends Exception {
//     public InvalidAgeException(String message) {
//         super(message);
//     }
// }

// public class VotingEligibility {
//     // Method to check voting eligibility
//     static void checkEligibility(int age) throws InvalidAgeException {
//         if (age < 18) {
//             throw new InvalidAgeException("Age must be 18 or above to vote.");
//         }
//         System.out.println("You are eligible to vote.");
//     }

//     public static void main(String[] args) {
//         try {
//             int age = 16; // Change this value to test different cases
//             checkEligibility(age);
//         } catch (InvalidAgeException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }

//! . Create a Java program to demonstrate the use of `ArrayList` and `HashMap` from the Collections Framework. Perform basic operations such as adding, removing, and iterating over elements.

// import java.util.ArrayList;
// import java.util.HashMap;

// public class CollectionsDemo {
//     public static void main(String[] args) {
//         // --- ArrayList Demonstration ---
//         ArrayList<String> fruits = new ArrayList<>();

//         // Adding elements to ArrayList
//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Mango");

//         // Removing an element
//         fruits.remove("Banana");

//         // Iterating over ArrayList
//         System.out.println("ArrayList Elements:");
//         for (String fruit : fruits) {
//             System.out.println(fruit);
//         }

//         System.out.println(); // Line break

//         // --- HashMap Demonstration ---
//         HashMap<Integer, String> students = new HashMap<>();

//         // Adding key-value pairs to HashMap
//         students.put(101, "Alice");
//         students.put(102, "Bob");
//         students.put(103, "Charlie");

//         // Removing an entry
//         students.remove(102);

//         // Iterating over HashMap
//         System.out.println("HashMap Elements:");
//         for (Integer key : students.keySet()) {
//             System.out.println("ID: " + key + ", Name: " + students.get(key));
//         }
//     }
// }


//! Write a Java program to read data from a file using `BufferedReader` and write the processed output to another file using `BufferedWriter`. Include exception handling mechanisms to manage possible I/O errors

// import java.io.*;

// public class FileReadWrite {
//     public static void main(String[] args) {
//         // Input and output file paths
//         String inputFile = "input.txt";
//         String outputFile = "output.txt";

//         // Try-with-resources to handle file operations
//         try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//              BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

//             String line;
//             while ((line = reader.readLine()) != null) {
//                 // Processing: Convert text to uppercase before writing
//                 writer.write(line.toUpperCase());
//                 writer.newLine();
//             }
//             System.out.println("File processing completed. Check " + outputFile);
//         } catch (FileNotFoundException e) {
//             System.out.println("Error: Input file not found.");
//         } catch (IOException e) {
//             System.out.println("Error: An I/O exception occurred.");
//         }
//     }
// }

// ! Implement a Java program that demonstrates the difference between byte streams and character streams by reading and writing a text file using both approaches.


// import java.io.*;

// public class ByteVsCharacterStreams {
//     public static void main(String[] args) {
//         String inputFile = "input.txt";
//         String byteOutputFile = "byte_output.txt";
//         String charOutputFile = "char_output.txt";

//         // Byte Stream (FileInputStream & FileOutputStream)
//         try (FileInputStream fis = new FileInputStream(inputFile);
//              FileOutputStream fos = new FileOutputStream(byteOutputFile)) {

//             int byteData;
//             while ((byteData = fis.read()) != -1) {
//                 fos.write(byteData); // Writing byte-by-byte
//             }
//             System.out.println("Byte stream operation completed. Check " + byteOutputFile);
//         } catch (IOException e) {
//             System.out.println("Byte Stream Error: " + e.getMessage());
//         }

//         // Character Stream (FileReader & FileWriter)
//         try (FileReader fr = new FileReader(inputFile);
//              FileWriter fw = new FileWriter(charOutputFile)) {

//             int charData;
//             while ((charData = fr.read()) != -1) {
//                 fw.write(charData); // Writing character-by-character
//             }
//             System.out.println("Character stream operation completed. Check " + charOutputFile);
//         } catch (IOException e) {
//             System.out.println("Character Stream Error: " + e.getMessage());
//         }
//     }
// }

//! Write a Java program to implement exception handling strategies by demonstrating the use of `try-catch finally` and `throws` keywords with a scenario involving division by zero

// import java.util.Scanner;

// public class ExceptionHandlingDemo {
    
//     // Method that performs division and uses `throws`
//     public static int divide(int a, int b) throws ArithmeticException {
//         return a / b; // May throw ArithmeticException if b is 0
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         try {
//             // Taking user input
//             System.out.print("Enter numerator: ");
//             int num = scanner.nextInt();

//             System.out.print("Enter denominator: ");
//             int den = scanner.nextInt();

//             // Calling the method that throws an exception
//             int result = divide(num, den);
//             System.out.println("Result: " + result);
            
//         } catch (ArithmeticException e) {
//             // Handling division by zero
//             System.out.println("Error: Division by zero is not allowed.");
//         } catch (Exception e) {
//             // Handling other exceptions
//             System.out.println("An unexpected error occurred: " + e.getMessage());
//         } finally {
//             // This block always executes
//             System.out.println("Execution completed.");
//             scanner.close(); // Closing scanner resource
//         }
//     }
// }

//! Develop a Java program to simulate a queue using the `LinkedList` class from the Collections Framework. Include operations like enqueue, dequeue, and display.

// import java.util.LinkedList;
// import java.util.Queue;

// public class QueueDemo {
//     public static void main(String[] args) {
//         // Creating a queue using LinkedList
//         Queue<Integer> queue = new LinkedList<>();

//         // Enqueue (Adding elements)
//         queue.add(10);
//         queue.add(20);
//         queue.add(30);
//         queue.add(40);

//         System.out.println("Queue after enqueuing elements: " + queue);

//         // Dequeue (Removing elements)
//         int removedElement = queue.poll(); // Removes the front element
//         System.out.println("Dequeued element: " + removedElement);
//         System.out.println("Queue after dequeuing: " + queue);

//         // Peek (Checking the front element without removing it)
//         int frontElement = queue.peek();
//         System.out.println("Front element: " + frontElement);

//         // Checking if the queue is empty
//         System.out.println("Is the queue empty? " + queue.isEmpty());
//     }
// }

//! Write a Java program to create multiple threads and assign different priorities to them. Observe and explain the impact of thread priority on their execution order

// class MyThread extends Thread {
//     public MyThread(String name, int priority) {
//         super(name);
//         setPriority(priority);
//     }

//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(getName() + " (Priority: " + getPriority() + ") is executing - Count: " + i);
//         }
//     }
// }

// public class ThreadPriorityDemo {
//     public static void main(String[] args) {
//         // Creating three threads with different priorities
//         MyThread t1 = new MyThread("Low Priority Thread", Thread.MIN_PRIORITY); // Priority 1
//         MyThread t2 = new MyThread("Medium Priority Thread", Thread.NORM_PRIORITY); // Priority 5
//         MyThread t3 = new MyThread("High Priority Thread", Thread.MAX_PRIORITY); // Priority 10

//         // Starting the threads
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

// ! . Write a Java program to demonstrate the use of generic collections by implementing a `HashMap` to store and retrieve student details (e.g., roll number and name). Include operations to add, remove, and search for students.

// import java.util.HashMap;
// import java.util.Scanner;

// public class StudentDatabase {
//     public static void main(String[] args) {
//         HashMap<Integer, String> studentMap = new HashMap<>();
//         Scanner scanner = new Scanner(System.in);
//         int choice;

//         while (true) {
//             System.out.println("\nStudent Management System");
//             System.out.println("1. Add Student");
//             System.out.println("2. Remove Student");
//             System.out.println("3. Search Student");
//             System.out.println("4. Display All Students");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     // Add student
//                     System.out.print("Enter Roll Number: ");
//                     int rollNo = scanner.nextInt();
//                     scanner.nextLine(); // Consume newline
//                     System.out.print("Enter Student Name: ");
//                     String name = scanner.nextLine();
//                     studentMap.put(rollNo, name);
//                     System.out.println("Student added successfully!");
//                     break;

//                 case 2:
//                     // Remove student
//                     System.out.print("Enter Roll Number to remove: ");
//                     int rollToRemove = scanner.nextInt();
//                     if (studentMap.containsKey(rollToRemove)) {
//                         studentMap.remove(rollToRemove);
//                         System.out.println("Student removed successfully!");
//                     } else {
//                         System.out.println("Student not found!");
//                     }
//                     break;

//                 case 3:
//                     // Search student
//                     System.out.print("Enter Roll Number to search: ");
//                     int rollToSearch = scanner.nextInt();
//                     if (studentMap.containsKey(rollToSearch)) {
//                         System.out.println("Student Found: " + studentMap.get(rollToSearch));
//                     } else {
//                         System.out.println("Student not found!");
//                     }
//                     break;

//                 case 4:
//                     // Display all students
//                     System.out.println("Student List:");
//                     for (HashMap.Entry<Integer, String> entry : studentMap.entrySet()) {
//                         System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
//                     }
//                     break;

//                 case 5:
//                     // Exit the program
//                     System.out.println("Exiting...");
//                     scanner.close();
//                     System.exit(0);

//                 default:
//                     System.out.println("Invalid choice! Please try again.");
//             }
//         }
//     }
// }


// ! Describe the steps involved in creating and using a user-defined exception in Java. Write a Java program to handle an invalid bank transaction using a custom exception class.


// // Step 1: Create a custom exception class
// class InsufficientBalanceException extends Exception {
//     public InsufficientBalanceException(String message) {
//         super(message);
//     }
// }

// // Step 2: Define a BankAccount class with deposit and withdraw methods
// class BankAccount {
//     private double balance;

//     public BankAccount(double initialBalance) {
//         this.balance = initialBalance;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
//     }

//     public void withdraw(double amount) throws InsufficientBalanceException {
//         if (amount > balance) {
//             throw new InsufficientBalanceException("Transaction Failed! Insufficient Balance.");
//         }
//         balance -= amount;
//         System.out.println("Withdrawn: $" + amount + " | Remaining Balance: $" + balance);
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// // Step 3: Implement the main method to handle transactions
// public class BankTransaction {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount(500); // Initial balance: $500

//         try {
//             account.deposit(200);
//             account.withdraw(100);
//             account.withdraw(700); // This will trigger the exception
//         } catch (InsufficientBalanceException e) {
//             System.out.println("Error: " + e.getMessage());
//         } finally {
//             System.out.println("Transaction completed. Final Balance: $" + account.getBalance());
//         }
//     }
// }

// !Differentiate between `Set` and `List` in the Java Collections Framework. Write a program to demonstrate their usage by storing and iterating over elements

// import java.util.*;

// public class ListSetExample {
//     public static void main(String[] args) {
//         // Using a List (Allows duplicates & maintains insertion order)
//         List<String> nameList = new ArrayList<>();
//         nameList.add("Alice");
//         nameList.add("Bob");
//         nameList.add("Charlie");
//         nameList.add("Alice");  // Duplicate allowed
        
//         System.out.println("List Elements:");
//         for (String name : nameList) {
//             System.out.println(name);
//         }

//         // Using a Set (No duplicates, no guaranteed order)
//         Set<String> nameSet = new HashSet<>(nameList); // Eliminates duplicate "Alice"

//         System.out.println("\nSet Elements:");
//         for (String name : nameSet) {
//             System.out.println(name);
//         }
//     }
// }

//!  Write a program to serialize and deserialize an object of a custom class that stores employee details

// import java.io.*;

// // Step 1: Create a Serializable Employee class
// class Employee implements Serializable {
//     private static final long serialVersionUID = 1L; // Version control
//     private int id;
//     private String name;
//     private double salary;

//     public Employee(int id, String name, double salary) {
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }

//     public void display() {
//         System.out.println("Employee ID: " + id);
//         System.out.println("Name: " + name);
//         System.out.println("Salary: $" + salary);
//     }
// }

// public class SerializeDemo {
//     public static void main(String[] args) {
//         Employee emp = new Employee(101, "Alice", 55000.0);
//         String filename = "employee.ser";

//         // Step 2: Serialize the Employee object
//         try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
//             out.writeObject(emp);
//             System.out.println("Serialization successful: Object saved to " + filename);
//         } catch (IOException e) {
//             System.out.println("Serialization failed: " + e.getMessage());
//         }

//         // Step 3: Deserialize the Employee object
//         try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
//             Employee deserializedEmp = (Employee) in.readObject();
//             System.out.println("\nDeserialization successful: Object restored.");
//             deserializedEmp.display();
//         } catch (IOException | ClassNotFoundException e) {
//             System.out.println("Deserialization failed: " + e.getMessage());
//         }
//     }
// }

// ! Create a menu based calculator to perform various operations

// import java.util.Scanner;

// public class Calculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int choice;
        
//         do {
//             System.out.println("\n--- Menu-Based Calculator ---");
//             System.out.println("1. Addition");
//             System.out.println("2. Subtraction");
//             System.out.println("3. Multiplication");
//             System.out.println("4. Division");
//             System.out.println("5. Modulus");
//             System.out.println("6. Exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();

//             if (choice >= 1 && choice <= 5) {
//                 System.out.print("Enter first number: ");
//                 double num1 = sc.nextDouble();
//                 System.out.print("Enter second number: ");
//                 double num2 = sc.nextDouble();
                
//                 switch (choice) {
//                     case 1 -> System.out.println("Result: " + (num1 + num2));
//                     case 2 -> System.out.println("Result: " + (num1 - num2));
//                     case 3 -> System.out.println("Result: " + (num1 * num2));
//                     case 4 -> {
//                         if (num2 != 0)
//                             System.out.println("Result: " + (num1 / num2));
//                         else
//                             System.out.println("Error: Division by zero!");
//                     }
//                     case 5 -> {
//                         if (num2 != 0)
//                             System.out.println("Result: " + (num1 % num2));
//                         else
//                             System.out.println("Error: Modulus by zero!");
//                     }
//                 }
//             } else if (choice != 6) {
//                 System.out.println("Invalid choice! Please try again.");
//             }

//         } while (choice != 6);
        
//         System.out.println("Calculator closed.");
//         sc.close();
//     }
// }

//! . Discuss the various access specifiers in Java. Create 2 packages P1 & P2 and create classes Student and BTech in P1 and P2 respectively. Check the accessibility of 3 methods of the package p1 into package p2. Access specifier of one method is private, one is protected and third one is default.

// package P1;

// public class Student {
//     private void privateMethod() {
//         System.out.println("Private method in Student class");
//     }

//     void defaultMethod() {
//         System.out.println("Default method in Student class");
//     }

//     protected void protectedMethod() {
//         System.out.println("Protected method in Student class");
//     }

//     public void publicMethod() {
//         System.out.println("Public method in Student class");
//     }
// }


// package P2;

// import P1.Student;

// public class BTech extends Student {
//     public static void main(String[] args) {
//         Student student = new Student();
        
//         // student.privateMethod(); // ❌ Not Accessible (private)
//         // student.defaultMethod(); // ❌ Not Accessible (default)
//         // student.protectedMethod(); // ❌ Not Accessible directly (needs subclassing)

//         BTech obj = new BTech();
//         // obj.privateMethod(); // ❌ Not Accessible (private)
//         // obj.defaultMethod(); // ❌ Not Accessible (default)
//         obj.protectedMethod(); // ✅ Accessible because of inheritance
//         obj.publicMethod(); // ✅ Accessible everywhere
//     }
// }


//! Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd

// class OddNumberException extends Exception {
//     public OddNumberException(String message) {
//         super(message);
//     }
// }

// public class OddNumberCheck {
//     static void checkEven(int num) throws OddNumberException {
//         if (num % 2 != 0) {
//             throw new OddNumberException("Error: " + num + " is an odd number!");
//         } else {
//             System.out.println(num + " is even.");
//         }
//     }

//     public static void main(String[] args) {
//         int number = 7; // Change this value to test
        
//         try {
//             checkEven(number);
//         } catch (OddNumberException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }


//! Create a user defined exception “UnderageforVoting” exception and throw it when voter’s age is below 18.

// // Custom Exception Class
// class UnderageForVoting extends Exception {
//     public UnderageForVoting(String message) {
//         super(message);
//     }
// }

// public class VotingEligibility {
//     // Method to check voting eligibility
//     static void checkEligibility(int age) throws UnderageForVoting {
//         if (age < 18) {
//             throw new UnderageForVoting("Not eligible to vote. Age must be 18 or above.");
//         } else {
//             System.out.println("You are eligible to vote.");
//         }
//     }

//     public static void main(String[] args) {
//         int voterAge = 16; // Change this value to test

//         try {
//             checkEligibility(voterAge);
//         } catch (UnderageForVoting e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

//! Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.

// class BankAccount {
//     private int balance;

//     public BankAccount(int initialBalance) {
//         this.balance = initialBalance;
//     }

//     public synchronized void deposit(int amount) {
//         balance += amount;
//         System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Balance: " + balance);
//     }

//     public synchronized void withdraw(int amount) {
//         if (balance >= amount) {
//             balance -= amount;
//             System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Balance: " + balance);
//         } else {
//             System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + " but insufficient balance.");
//         }
//     }

//     public int getBalance() {
//         return balance;
//     }
// }

// public class BankTransaction {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount(1000);

//         Thread depositThread = new Thread(() -> {
//             for (int i = 0; i < 5; i++) {
//                 account.deposit(500);
//                 try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
//             }
//         }, "DepositThread");

//         Thread withdrawThread = new Thread(() -> {
//             for (int i = 0; i < 5; i++) {
//                 account.withdraw(400);
//                 try { Thread.sleep(150); } catch (InterruptedException e) { e.printStackTrace(); }
//             }
//         }, "WithdrawThread");

//         depositThread.start();
//         withdrawThread.start();
//     }
// }

//! Write a Java program using Anonymous class and override method in anonymous class.

// // Interface with a method
// interface Greeting {
//     void sayHello();
// }

// public class AnonymousClassDemo {
//     public static void main(String[] args) {
//         // Creating an anonymous class implementing Greeting
//         Greeting greeting = new Greeting() {
//             @Override
//             public void sayHello() {
//                 System.out.println("Hello! This is an anonymous class.");
//             }
//         };

//         // Calling the method
//         greeting.sayHello();
//     }
// }

//! Write a Java program for creating four threads to perform the following operations i) Getting N numbers as input ii) Printing the even numbers iii) Printing the odd numbers iv) Computing the average.

// import java.util.ArrayList;
// import java.util.Scanner;

// class NumberInput extends Thread {
//     ArrayList<Integer> numbers;

//     public NumberInput(ArrayList<Integer> numbers) {
//         this.numbers = numbers;
//     }

//     @Override
//     public void run() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of elements: ");
//         int n = scanner.nextInt();
//         System.out.println("Enter " + n + " numbers:");
//         for (int i = 0; i < n; i++) {
//             numbers.add(scanner.nextInt());
//         }
//     }
// }

// class EvenNumbers extends Thread {
//     ArrayList<Integer> numbers;

//     public EvenNumbers(ArrayList<Integer> numbers) {
//         this.numbers = numbers;
//     }

//     @Override
//     public void run() {
//         System.out.print("Even numbers: ");
//         for (int num : numbers) {
//             if (num % 2 == 0) {
//                 System.out.print(num + " ");
//             }
//         }
//         System.out.println();
//     }
// }

// class OddNumbers extends Thread {
//     ArrayList<Integer> numbers;

//     public OddNumbers(ArrayList<Integer> numbers) {
//         this.numbers = numbers;
//     }

//     @Override
//     public void run() {
//         System.out.print("Odd numbers: ");
//         for (int num : numbers) {
//             if (num % 2 != 0) {
//                 System.out.print(num + " ");
//             }
//         }
//         System.out.println();
//     }
// }

// class ComputeAverage extends Thread {
//     ArrayList<Integer> numbers;

//     public ComputeAverage(ArrayList<Integer> numbers) {
//         this.numbers = numbers;
//     }

//     @Override
//     public void run() {
//         int sum = 0;
//         for (int num : numbers) {
//             sum += num;
//         }
//         double avg = (numbers.size() > 0) ? (double) sum / numbers.size() : 0;
//         System.out.println("Average: " + avg);
//     }
// }

// public class MultiThreadingDemo {
//     public static void main(String[] args) throws InterruptedException {
//         ArrayList<Integer> numbers = new ArrayList<>();

//         NumberInput inputThread = new NumberInput(numbers);
//         inputThread.start();
//         inputThread.join(); // Wait for input thread to finish

//         EvenNumbers evenThread = new EvenNumbers(numbers);
//         OddNumbers oddThread = new OddNumbers(numbers);
//         ComputeAverage avgThread = new ComputeAverage(numbers);

//         evenThread.start();
//         oddThread.start();
//         avgThread.start();
//     }
// }

//! With proper syntax and example explain following thread methods: wait( ) (2) sleep( ) (3) resume( ) (4) notify( )

//! Wait

// class WaitNotifyExample {
//     public static void main(String[] args) {
//         final Object lock = new Object();
        
//         Thread waitingThread = new Thread(() -> {
//             synchronized (lock) {
//                 try {
//                     System.out.println("Thread is waiting...");
//                     lock.wait();
//                     System.out.println("Thread resumed after notify()");
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         });

//         Thread notifyingThread = new Thread(() -> {
//             try {
//                 Thread.sleep(2000); // Simulate delay
//                 synchronized (lock) {
//                     System.out.println("Thread calling notify()");
//                     lock.notify();
//                 }
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         });

//         waitingThread.start();
//         notifyingThread.start();
//     }
// }

//! resume

// class ResumeExample {
//     private static final Object lock = new Object();
//     private static boolean paused = true;

//     public static void main(String[] args) {
//         Thread thread = new Thread(() -> {
//             synchronized (lock) {
//                 while (paused) {
//                     try {
//                         System.out.println("Thread waiting...");
//                         lock.wait(); // Waiting until notify() is called
//                     } catch (InterruptedException e) {
//                         e.printStackTrace();
//                     }
//                 }
//                 System.out.println("Thread resumed!");
//             }
//         });

//         thread.start();

//         try {
//             Thread.sleep(2000);
//             synchronized (lock) {
//                 paused = false;
//                 lock.notify(); // Resume the thread
//                 System.out.println("Thread notified");
//             }
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

//! notify()

// same as wait 


//! Write a java program to copy the content of the file “file1.txt” into new file “file2.txt”.

// import java.io.*;

// public class FileCopy {
//     public static void main(String[] args) {
//         String sourceFile = "file1.txt"; // Source file
//         String destinationFile = "file2.txt"; // Destination file
        
//         try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
//              BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 writer.write(line);
//                 writer.newLine(); // Ensuring line breaks are maintained
//             }
            
//             System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }

//! Write a Java program that creates three threads. First thread displays “Hello!” in every one second, the second thread displays “Wear Mask!” in every two seconds and “Use Sanitizer!” in every 5 seconds.

// class HelloThread extends Thread {
//     public void run() {
//         try {
//             while (true) {
//                 System.out.println("Hello!");
//                 Thread.sleep(1000); // 1 second
//             }
//         } catch (InterruptedException e) {
//             System.out.println("HelloThread interrupted");
//         }
//     }
// }

// class MaskThread extends Thread {
//     public void run() {
//         try {
//             while (true) {
//                 System.out.println("Wear Mask!");
//                 Thread.sleep(2000); // 2 seconds
//             }
//         } catch (InterruptedException e) {
//             System.out.println("MaskThread interrupted");
//         }
//     }
// }

// class SanitizerThread extends Thread {
//     public void run() {
//         try {
//             while (true) {
//                 System.out.println("Use Sanitizer!");
//                 Thread.sleep(5000); // 5 seconds
//             }
//         } catch (InterruptedException e) {
//             System.out.println("SanitizerThread interrupted");
//         }
//     }
// }

// public class MultiThreadDemo {
//     public static void main(String[] args) {
//         HelloThread t1 = new HelloThread();
//         MaskThread t2 = new MaskThread();
//         SanitizerThread t3 = new SanitizerThread();

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

//! Write a program that iterates over a Map (such as HashMap) and prints each key-value pair

// import java.util.HashMap;
// import java.util.Map;

// public class HashMapIteration {
//     public static void main(String[] args) {
//         // Creating a HashMap with sample data
//         HashMap<Integer, String> map = new HashMap<>();
//         map.put(1, "Alice");
//         map.put(2, "Bob");
//         map.put(3, "Charlie");
//         map.put(4, "David");

//         // Iterating using entrySet() and enhanced for-loop
//         System.out.println("Using entrySet() with for-each loop:");
//         for (Map.Entry<Integer, String> entry : map.entrySet()) {
//             System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//         }

//         // Iterating using keySet() and getting values from the map
//         System.out.println("\nUsing keySet() with for-each loop:");
//         for (Integer key : map.keySet()) {
//             System.out.println("Key: " + key + ", Value: " + map.get(key));
//         }

//         // Iterating using Java 8 forEach() method
//         System.out.println("\nUsing forEach() method:");
//         map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
//     }
// }

//! 
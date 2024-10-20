package Basics_Of_Java;

// import java.util.Scanner;
// import java.util.Scanner;
//! JAVA FIRST PROGRAM
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("hello world!");
//     }
// }
//! INPUTS IN JAVA
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println(input.nextLine());
//     }
// }
//! PRIMITIVE DATA TYPES IN JAVA
// public class Main {
//     public static void main(String[] args) {
//         int rollNo = 64;
//         char letter = 'r';
//         float marks = 98.67f;
//         double largeDecimalNumbers = 4567654.4567;
//         long largeInteger = 34567834567876543L;
//         boolean check = false;
//     }
// }
//! INT INPUT PROGRAM
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Please enter some input:");
//         int rollNo = input.nextInt();
//         System.out.println("Your roll number is: " + rollNo);
//     }
// }
//! LITERALS AND IDENTIFIERS
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int a = 234_000_000;
//         System.out.println(a);
//     }
// }
//! STRING INPUT PROGRAM
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String name = input.nextLine();
//         System.out.println(name);
//     }
// }
//! FLOAT INPUT PROGRAM
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         float marks = input.nextFloat();
//         System.out.println(marks);
//     }
// }
//! SUM OF TWO/THREE NUMBERS
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Please enter 3 numbers:");
//         int num1 = input.nextInt();
//         int num2 = input.nextInt();
//         int num3 = input.nextInt();
//         int SUM = num1 + num2 + num3;
//         System.out.println("sum = " + SUM);
//     }
// }
//! TYPE CASTING
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int num = (int)(45.34f);
//         System.out.println(num);
//     }
// }
//! AUTOMATIC TYPE PROMOTION IN EXPRESSIONS
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int a = 128;
//         byte b = (byte)(a);
//         System.out.println(b);
//     }
// }
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         byte a = 40;
//         byte b = 50;
//         byte c = 100;
//         int d = a * b / c;
//         System.out.println(d);
//     }
// }
//! IF STATEMENTS BASICS
// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         if (a == 10) {
//             System.out.println("Hello world");
//         }
//     }
// }
//! WHILE LOOP BASICS
// public class Main{
//     public static void main(String[] args) {
//         int count = 1;
//         while(count != 5){
//             System.out.println(count);
//             count++;
//         }
//    }
// }
//! FOR LOOP BASICS
// public class Main {
//     public static void main(String[] args) {
//         for(int count = 0; count != 5; count++) {
//             System.out.println(count);
//         }
//     }
// }
//!TEMPERATURE CONVERTOR 
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Please enter the temperature:");
//         float tempC = input.nextFloat();
//         float tempF = (tempC * 9/5) + 32;
//         System.out.println(tempF);
//     }
// }
//!ASSIGNMENT 1
//! Ques-1 Write a program to print whether a number is even or odd, also take input from the user.
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Please enter a number :");
//         int num = input.nextInt();
//         if(num % 2 == 0){
//             System.out.println("The number is even");
//         }
//         else{
//             System.out.println("The number is odd");
//         }
//     }
// }
//! Ques-2 Take name as input and print a greeting message for that particular name.
// import  java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Please enter a name: ");
//         String name = input.nextLine();
//         System.out.println("Welcome " +  name);
//     }
// }
//! Ques-3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// public class Main {
//     public static void main(String[] args) {
//         Scanner input =  new Scanner(System.in);
//         float principal = input.nextFloat();
//         float time = input.nextFloat();
//         float rate = input.nextFloat();
//         float SI = (principal * time * rate) / 100;
//         System.out.println("The Simple Interest is: " + SI);
//     }
// }
//! Ques-4 Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the first number:");
//         int a = input.nextInt();
//         System.out.print("Enter the second number:");
//         int b = input.nextInt();
//         System.out.print("Enter the operator (+,-,*,/): ");
//         char operator = input.next().charAt(0);
//         double result = 0;
//         if(operator == '+'){
//             result = a + b;
//         }
//         else if(operator == '-'){
//             result = a - b;
//         }
//         else if(operator == '*'){
//             result = a * b;
//         }
//         else if(operator == '/'){
//             if(b == 0){
//                 System.out.println("Error: Division by zero is not possible.");
//             }
//             result = a / b;
//         }
//         else{
//             System.out.println("Error: Invalid operator.");
//         }
//         System.out.println("Result: " + result);
//     }
// }
//! Ques-5 Take 2 numbers as input and print the largest number.
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = input.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = input.nextInt();
//         if(a > b){
//             System.out.println("First number is largest");
//         }
//         else{
//             System.out.println("Second number is largest");
//         }
//     }
// }
//! Ques-6 Input currency in rupees and output in USD.
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Please enter the amount in rupees:");
//         int rupees = input.nextInt();
//         int usd = rupees / 80;
//         System.out.println("Your amount in USD is : " + usd);
//     }
// }
//! Ques-7 To calculate Fibonacci Series up to n numbers.
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int a = 0;
//         int b = 1;
//         System.out.print(a + " ");
//         if (n > 1){
//             System.out.print(b + " ");
//         }
//         for(int i = 3; i <= n; i++){
//             int next = a + b;
//             System.out.print(next + " ");
//             a = b;
//             b = next;
//         }
//     }
// }
//! To find out whether the given String is Palindrome or not
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int m = n;
//         int reverse = 0;
//         while(n > 0) {
//             int digit = n % 10;
//             reverse = reverse * 10 + digit;
//             n = n / 10;
//         }
//         System.out.println(reverse);
//         if(m == reverse){
//             System.out.println("The number is a palindrome");
//         }
//         else{
//             System.out.println("The number is not a palindrome");
//         }
//     }
// }
//! To find Armstrong Number between two given number.

// public class Main {
//     public static void main(String[] args) {
//         for (int i = 100; i < 1000; i++) {
//             if (isArmstrong(i)) {
//                 System.out.println(i);
//             }
//         }
//     }
//     static boolean isArmstrong(int n) {
//         int original = n;
//         int sum = 0;
//         if (n < 0) {
//             System.out.println("Please input a positive number.");
//         } else {
//             while (n > 0) {
//                 int rem = n % 10;
//                 sum += rem * rem * rem;
//                 n /= 10;
//             }
//         }
//         return sum == original;
//     }
// }

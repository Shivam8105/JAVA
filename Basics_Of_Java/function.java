package Basics_Of_Java;

//         sum();
//     }
//     static void sum() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter number 1: ");
//         int num1 = in.nextInt();
//         System.out.print("Enter number 2: ");
//         int num2 = in.nextInt();
//         int sum = num1 + num2;
//         System.out.println("The sum is " + sum);
//     }
// }
//! GREETING
// public class function {
//     public static void main(String[] args) {
//         greeting();
//     }
//     static void greeting() {
//         System.out.println("Hello World");
//     }
// }
//! RETURN INTEGER VALUES
// public class function {
//     public static void main(String[] args) {
//         int ans = sum();
//         System.out.println(ans);
//     }
//     static int sum() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter number 1: ");
//         int num1 = in.nextInt();
//         System.out.print("Enter number 2: ");
//         int num2 = in.nextInt();
//         int sum = num1 + num2;
//         return sum;
//     }
// }
//! RETURNING STRING VALUES
// public class function {
//     public static void main(String[] args) {
//         String message = greet();
//         System.out.println(message);
//     }
//     static String greet() {
//         String greeting = "how are you?";
//         return greeting;
//     }
// }
//! PARAMETERS IN STRING
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = in.nextLine();
//         String personalised = myGreet(name);
//         System.out.println(personalised);
//     }
//     static String myGreet(String name) {
//         String message = "Hello " + name;
//         return message;
//     }
// }
//! PARAMETERS IN INTEGER
// public class function {
//     public static void main(String[] args) {
//         int ans = sum(20,30);
//         System.out.println(ans);
//     }
//     static int sum(int a,int b) {
//         int sum = a + b;
//         return sum;
//     }
// }
//! SWAPPING TWO NUMBERS USING THIRD VARIABLE
// public class function {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a + " " + b);
//     }
// }
// public class function {
//     public static void main(String[] args) {
//         int a  = 10;
//         int b = 20;
//         swap(a, b);
//         System.out.println(a + " " + b);
//     }
//     static void swap(int a,int b) {
//         int temp = a;
//         a = b;
//         b = temp;
//     }
// }
//! CHANGE VALUE
// import java.util.Arrays; 
// public class function {
//     public static void main(String[] args) {
//         int[] arr = {1,3,4,45,6};
//         change(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void change(int[] nums) {
//         nums[0] = 99;  //if you make a change to the object via this ref variable, same object will be changed.
//     }
// }
//! SCOPING - METHOD SCOPING
// public class function {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//          System.out.println(num);
//     }
//     static void random(int num) {
//         int num = 67;
//         System.out.println(num);
//     }
// }
//! BLOCK SCOPE
//! accessibility of variables within a specific block of code.defined by curly braces '{}'.variables declared inside a block are only accessible within that block and are not visible outside of it.
//! LOOP SCOPE = variables declared inside a loop are accessible within that loop and not outside of it.
//! THE VARIABLES WHICH ARE DECLARED/INITIALISED OUTSIDE THE SCOPE CAN BE UPDATED INSIDE THE SCOPE. BUT THE VARIABLES DECLARED INSIDE THE SCOPE CANNOT BE USED BUT ONLY BE UPDATED OUTSIDE THE SCOPE.
//! SHADOWING = occurs when a variable declared within a certain scope has the same name as a variable declared in an outer scope.

// public class function {
//     static int x = 90;
//     public static void main(String[] args) {
//         System.out.println(x);
//         int x = 40;
//         System.out.println(x);
//         fun();
//     }
//     static void fun() {
//         System.out.println(x);
//     }
// }
//! VARIABLE LENGTH ARGUMENTS = allow functions to accept an arbitrary number of arguments. This can be used in cases when you don't know the number of arguments.
// import java.util.Arrays;
// public class function {
//     public static void main(String[] args) {
//         fun(2,3,4,5,56,87,23,45);
//     }
//     public static void fun(int ...v) {
//         System.out.println(Arrays.toString(v));
//     }
// }

// import java.util.Arrays;

// public class function {
//     public static void main(String[] args) {
//         multiple(2, 3, "shivam");
//     }

//     static void multiple(int a, int b, String... v) {   
//     }
// }
// ! METHOD OVERLOADING = allows a class to have more than one method with the
// same name,provided their parameter lists(number or type of parameters) are
// different.
// it works on compile time polymorphism.
// public class function {
// public static void main(String[] args) {
// fun(67);
// fun("Shivam kumar");
// int ans = sum(3,4,8);
// System.out.println(ans);
// }
// static int sum(int a,int b) {
// return a + b;
// }
// static int sum(int a,int b,int c) {
// return a + b + c;
// }
// static void fun(int a) {
// System.out.println("first one");
// System.out.println(a);
// }
// static void fun(String name) {
// System.out.println("Second one");
// System.out.println(name);
// }
// }
// ! QUESTION-1 PRIME NUMBERS
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// int n = in.nextInt();
// System.out.println(isPrime(n));
// }
// static boolean isPrime(int n) {
// if(n <= 1) {
// return false;
// }
// int c = 2;
// while(c * c <= n) {
// if(n % c == 0) {
// return false;
// }
// c++;
// }
// return c * c > n;
// }
// }
// ! QUESTION-2 ARMSTRONG NUMBERS
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter a number to know wheter it is armstrong or not: ");
// int n = in.nextInt();
// int m = n;
// int sum = 0;
// while(n > 0) {
// int rem = n % 10;
// int cube = rem * rem * rem;
// sum += cube;
// n /= 10;
// }
// System.out.println(sum);
// if(sum == m) {
// System.out.println("it is armstrong");
// }
// else{
// System.out.println("it is not armstrong");
// }
// }
// }
// ! QUES-1 define two methods to print the maximum and minimum number
// respectively among three numbers entered by the user.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter the first number: ");
// int num1 = in.nextInt();
// System.out.print("Enter the second number: ");
// int num2 = in.nextInt();
// System.out.print("Enter the third number: ");
// int num3 = in.nextInt();
// printMax(num1, num2, num3);
// printMin(num1, num2, num3);
// }
// static void printMax(int a,int b,int c){
// int max = a;
// if(b > max){
// max = b;
// }
// if(c > max){
// max = c;
// }
// System.out.println("The maximum number is : " + max);
// }
// static void printMin(int a,int b,int c){
// int min = a;
// if(b < min){
// min = b;
// }
// if(c < min){
// min = c;
// }
// System.out.println("The minimum number is : " + min);
// }
// }
// ! QUES-2 define a program to find out whether a given number is even or odd.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter the number: ");
// int num = in.nextInt();
// EvenOrOdd(num);
// }
// static void EvenOrOdd(int a) {
// if(a % 2 == 0){
// System.out.println(a + " is even");
// }
// else{
// System.out.println(a + " is odd");
// }
// }
// }
// ! QUES-3 A person is eligible to vote if his/her age is greater than or equal
// to 18.Define a method to find out if he/she is eligible to vote.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter your age: ");
// int age = in.nextInt();
// vote(age);
// }
// static void vote(int a) {
// if(a >= 18){
// System.out.println("You are eligible to vote.");
// }
// else{
// System.out.println("You are not eligible to vote.");
// }
// }
// }
// ! QUES-4 write a program to print the sum of two numbers entered by the user
// by defining your own method.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter the first number: ");
// int num1 = in.nextInt();
// System.out.print("Enter the second number: ");
// int num2 = in.nextInt();
// int result = calculateSum(num1, num2);
// System.out.println("The sum of "+ num1 + " and " + num2 + " is: " + result);
// }
// static int calculateSum(int a,int b){
// return a + b;
// }
// }
// ! QUES-5 Define a method that returns the product of two numbers entered by
// the user.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter the first number: ");
// int num1 = in.nextInt();
// System.out.print("Enter the second number: ");
// int num2 = in.nextInt();
// int result = calculateProduct(num1, num2);
// System.out.println("The product of " + num1 + " and " + num2 + " is " +
// result);
// }
// static int calculateProduct(int a ,int b){
// return a * b;
// }
// }
// ! QUES-6 Write a program to print the circumference and area of a circle of
// radius entered by user by defining your own method.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter the radius of the circle(in cm): ");
// float radius = in.nextFloat();
// float circumference = calcCircumference(radius);
// System.out.println("The circumference of the circle is: " + circumference);
// float area = calcArea(radius);
// System.out.println("The area of the circle is: " + area);
// }
// static float calcCircumference(float a){
// return (float)(2 * Math.PI * a);
// }
// static float calcArea(float a) {
// return (float)(Math.PI * a * a);
// }
// }
// ! QUES-7 Define a method to find out if a number is prime or not.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int num = in.nextInt();
// isPrime(num);
// }
// static boolean isPrime(int a) {
// if (a <= 0){
// return false;
// }
// int c = 2;
// while (c * c <= a) {
// if (a % c == 0) {
// return false;
// }
// c++;
// }
// return c * c > a;
// }
// }
// ! QUES-8 Write a program that will ask the user to enter his/her marks(out of
// 100).Define a method that will display grades according to the marks entered
// as below.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter your marks(out of 100): ");
// int marks = in.nextInt();
// String result = grade(marks);
// System.out.println("Your grade is: " + result);
// }
// static String grade(int a) {
// int category;
// if (a > 90) {
// category = 1;
// } else if (a > 80) {
// category = 2;
// } else if (a > 70) {
// category = 3;
// } else if (a > 60) {
// category = 4;
// } else if (a > 50) {
// category = 5;
// } else if (a > 40) {
// category = 6;
// } else {
// category = 7;
// }
// return switch (category) {
// case 1 ->
// "AA";
// case 2 ->
// "AB";
// case 3 ->
// "BB";
// case 4 ->
// "BC";
// case 5 ->
// "CD";
// case 6 ->
// "DD";
// case 7 ->
// "FAIL";
// default ->
// "INVALID";
// };
// }
// }
// ! QUES-9 Write a program to print a factorial of a number by defining a
// method named 'Factorial'.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter the number: ");
// int num = in.nextInt();
// int m = num;
// int result = factorial(num);
// System.out.println("The factorial of " + m + " is: " + result);
// }
// static int factorial(int a) {
// if (a < 0) {
// System.out.println("Factorial is not defined for negative numbers.");
// return -1;
// } else {
// int fact = 1;
// while (a > 0) {
// fact *= a;
// a--;
// }
// return fact;
// }
// }
// }
// ! QUES-10 Write a function if a number is a palindrome or not. Take number as
// parameter.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int num = in.nextInt();
// int m = num;
// int reverse = isPalindrome(num);
// System.out.println("The reverse of the number is: " + reverse);
// if (reverse == m) {
// System.out.println("The number is a palindrome.");
// } else {
// System.out.println("The number is not a palindrome.");
// }
// }
// static int isPalindrome(int number) {
// int reverse = 0;
// while (number > 0) {
// int rem = number % 10;
// reverse = reverse * 10 + rem;
// number /= 10;
// }
// return reverse;
// }
// }
// ! QUES- 12 Write a function to check if a given triplet is a pythagorean
// triplet or not.
// import java.util.Scanner;
// public class function {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.print("Enter the first no.: ");
// int Perpendicular = in.nextInt();
// System.out.print("Enter the second no.: ");
// int Base = in.nextInt();
// System.out.print("Enter the third no.: ");
// int Hypotneuse = in.nextInt();
// boolean isPythagoreanTriplet = pythagorean(Perpendicular, Base, Hypotneuse);
// if (isPythagoreanTriplet) {
// System.out.println("The numbers are Pythagorean triplet.");
// }
// else{
// System.out.println("The numbers do not form a Pythagorean triplet.");
// }
// }
// static boolean pythagorean(int a, int b, int c) {
// int sumOfSquares = a * a + b * b;
// return sumOfSquares == c * c;
// }
// }
// ! QUES-13 Write a function that returns all prime numbers between two given
// numbers.

// import java.util.Scanner;

// public class function {

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int num1 = in.nextInt();
//         System.out.print("Enter the second number: ");
//         int num2 = in.nextInt();
//         prime(num1, num2);
//     }

//     static void prime(int a, int b) {
//         for (int i = a; i <= b; i++) {
//             if (isPrime(i)) {
//                 System.out.println(i);
//             }
//         }
//     }

//     static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }
//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// ! QUES- 14 Write a function that returns the sum of first n natural numbers.

// import java.util.Scanner;

// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = in.nextInt();
//         int result = sum(n);
//         System.out.println("The sum of first " + n + " natural numbers is: " +
//                 result);
//     }

//     static int sum(int a) {
//         int add = 0;
//         for (int i = 1; i <= a; i++) {
//             add += i;
//         }
//         return add;
//     }
// }
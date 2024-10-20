package LearningJava;
// import java.util.*;

// public class lec1 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = in.nextInt();
//         in.close();
//         for(int i = 1; i < n; i++){
//             for(int j = i; j <= n - i; j++){
//                 System.out.println(" * ");
//             }
//         }
//     }
// }

// public class lec1{
//     public static void main(String[] args) {
//         int a = 10,b = 5;
//         int ans = (a * b) / (a - b);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// public class lec1{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();
//         in.close();
//         int Sum = a + b;
//         System.out.println("Sum: " + Sum);
//     }
// }

//! conditional statements

//! Using if else
// import java.util.*;
// public class lec1{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int button = in.nextInt();
//         in.close();
//         if(button == 1){
//             System.out.println("Hello");
//         }else if(button == 2){
//             System.out.println("Namaste");
//         }else if(button == 3){
//             System.out.println("Bonjour");
//         }else System.out.println("Invalid button");
//     }
// }

//! using switch

// import java.util.*;

// public class lec1 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         in.close();
//         switch (n) {
//             case 1: System.out.println("Hello");
//                 break;
//             case 2: System.out.println("Namaste");
//                 break;
//             case 3: System.out.println("Bonjour");
//                 break;
//             case 4: System.out.println("konichiva");
//                 break;
//             default: System.out.println("Invalid Selection");
//                 break;
//         }
//     }
// }

//! calculator using switch 

// import java.util.*;

// public class lec1 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number a: ");
//         int a = in.nextInt();
//         System.out.print("Enter the number b: ");
//         int b = in.nextInt();
//         System.out.print("Enter the operation(1 for +, 2 for -, 3 for *, 4 for /, 5 for %): ");
//         int operation = in.nextInt();
//         switch (operation) {
//             case 1:
//                 System.out.println(a + b);
//                 break;
//             case 2:
//                 System.out.println(a - b);
//                 break;
//             case 3:
//                 System.out.println(a * b);
//                 break;
//             case 4:
//                 System.out.println(a / b);
//                 break;
//             case 5:
//                 System.out.println(a % b);
//                 break;

//             default:
//                 System.out.println("Enter valid operation");
//                 break;
//         }
//     }
// }

//! for loops

// public class lec1{
//     public static void main(String[] args) {
//         for(int counter = 0; counter < 10; counter++){
//             System.out.println(counter);
//         }
//     }
// }

//! while loop

// public class lec1 {
//     public static void main(String[] args) {
//         int i = 0;
//         while (i < 11) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//! do while

// public class lec1{
//     public static void main(String[] args) {
//         int i = 0;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i < 11);
//     }
// }

//! print the sum of first n natural numbers

// import java.util.*;

// public class lec1{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = in.nextInt();
//         in.close();
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             sum = sum + i;
//         }
//         System.out.println("sum of the number is: " + sum);
//     }
// }

//! print the table of 2

// public class lec1{
//     public static void main(String[] args) {
//         for(int i = 2; i <= 20; i+=2){
//             System.out.println(i);
//         }
//     }
// }

//! Pattern Printing

//! Solid Rectangle

// public class lec1{
//     public static void main(String[] args) {
//         int num = 5;
//         for(int i = 0; i < num; i++){
//             for(int j = 0; j < num; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

//! Hollow Rectangle

// public class lec1{
//     public static void main(String[] args) {
//         int num = 5;
//         for(int i = 1; i <= num; i++){
//             for(int j = 1; j <= num; j++){
//                 if(i == 1 || i == num || j == 1 || j == num){
//                     System.out.print(" * ");
//                 }
//                 else{
//                     System.out.print("   ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//! Half Pyramid

// public class lec1{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//! Inverted Half Pyramid

// public class lec1{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

//! Inverted Half Pyramid(rotated by 180)

// public class lec1{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//! Half Pyramid with numbers

// public class lec1{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//! inverted Half Pyramid With Numbers

// public class lec1{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i + 1; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//! Floyd's Triangle

// public class lec1{
//     public static void main(String[] args) {
//         int n = 5;
//         int num = 1;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

//! 0 - 1 Triangle

// public class lec1{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 int sum = i + j;
//                 if(sum % 2 == 0){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


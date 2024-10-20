package Basics_Of_Java;
// import java.util.Scanner;

// public class fibonacci {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = in.nextInt();
//         in.close(); 

//         int x = 0;
//         int y = 1;
//         int z = 0; 
//         System.out.println(x);
//         System.out.println(y);
//         for (int i = 0; i < n; i++) {
//             z = x + y;
//             x = y;
//             y = z;

//             System.out.println(z); 
//         }

//     }
// }

// import java.util.Scanner;

// public class fibonacci{
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = in.nextInt();
//         int factorial = 1;
//         if(n < 0){
//             System.out.println("Factorials are not defined for negative numbers.");
//         }
//         while(n > 0){
//             factorial *=  n;
//             n--;
//         }
//         System.out.println(factorial);
//     }
// }

// !factorial using functions

// import java.util.*;

// public class fibonacci {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int fact = factorial(n);
//         System.out.println("The factorial of the number is: " + fact);
//     }

//     static int factorial(int x) {
//         int fact = 1;
//         if (x < 0) {
//             System.out.println("Only non-negative numbers");
//             return -1;
//         }
//         else{
//             while (x > 0) {
//                 fact = fact * x;
//                 x--;
//             }
//         }
//         return fact;
//     }
// }



package Basics_Of_Java;
// public class methodOverloading {
//     static int plusMethod(int x,int y){
//         return x + y;
//     }
//     static double plusMethod(double x,double y){
//         return x + y;
//     }

//     public static void main(String[] args) {
//         int first = plusMethod(8,5);
//         double second = plusMethod(4.3, 6.36);
//         System.out.println("int: " + first);
//         System.out.println("double: " + second);
//     }
// }

// multiple methods can have same name with different parameters.

//! Java Scope = variables are only accessible inside the region they are created.

//! Java Recursion


//! To print the sum of first 10 numbers

// public class methodOverloading {
//     public static int sum(int k) {
//         if (k > 0) {
//             return k + sum(k - 1);
//         } else {
//             return 0;
//         }
//     }
//     public static void main(String[] args) {
//         int result = sum(10);
//         System.out.println(result);
//     }
// }


//! to print the sum of the numbers between start and end
// public class methodOverloading{
//     public static int sum(int start,int end){
//         if(start <= end){
//             return start + sum(start + 1,end);
//         }else{
//             return 0;
//         }
//     }
//     public static void main(String[] args) {
//         int result = sum(5,10);
//         System.out.println("result is: " + result);
//     }
// }

//! creating objects in java

// public class methodOverloading{
//     int x = 5;

//     public static void main(String[] args){
//         methodOverloading myObj = new methodOverloading();
//         System.out.println(myObj.x);
//     }
// }
package LearningJava;

// import java.util.Scanner;

// public class array_questions {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int size = in.nextInt();
//         int arr[] = new int[size];
//         for(int i = 0; i < size; i++){
//             arr[i] = in.nextInt();
//         }
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] < min) min = arr[i];
//             if(arr[i] > max) max = arr[i];
//         }
//         System.out.println("Largest number is: " + max);
//         System.out.println("Smallest number is: " + min);
//         in.close();
//     }
// }

//! 2d arrays

// import java.util.*;

// public class array_questions{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the row number: ");
//         int rows = in.nextInt();
//         System.out.print("Enter the column number: ");
//         int cols = in.nextInt();

//         int arr[][] = new int[rows][cols];
//         System.out.print("Enter the array elements: ");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 arr[i][j] = in.nextInt();
//             }
//         }

//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         in.close();
//     }
// }

//! Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

// import java.util.*;

// public class array_questions {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the row number: ");
//         int rows = in.nextInt();
//         System.out.print("Enter the column number: ");
//         int cols = in.nextInt();

//         int arr[][] = new int[rows][cols];
//         System.out.print("Enter the array elements: ");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 arr[i][j] = in.nextInt();
//             }
//         }
//         System.out.print("Enter the number you need to find: ");
//         int x = in.nextInt();
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (arr[i][j] == x) {
//                     System.out.print("(" + i + "," +  j + ")");
//                 }
//             }
//         }
//     }
// }


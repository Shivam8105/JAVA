package Basics_Of_Java;

// import java.util.Arrays;
//  syntax
// datatype[] variable_name = new datatype[size];
// store 5 roll numbers;
// int[] rnos = new int[5];
// or directly
// import java.util.Scanner;
// public class arrays {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// int[] rnos2 = {23,12,45,32,15};
// System.out.println(rnos2[0]);
// for (int i = 0; i < rnos2.length; i++) {
//     System.out.println(rnos2[i]);
// }
// int[] arr = new int[5];
// arr[0] = 23;
// arr[1] = 45;
// arr[2] = 233;
// arr[3] = 543;
// arr[4] = 3;
// for (int i = 0; i < arr.length; i++) {
//     arr[i] = in.nextInt();
// }
// System.out.println(Arrays.toString(arr));
// [23,45,233,543,3]
// System.out.println(arr[3]);
//! for-each loop
// for(int num : arr) { // for every element in array, print the element
// System.out.println(num + " "); // here num represents element of the array
// }
//! ARRAY OF OBJECTS
// String[] str = new String[4];
// for (int i = 0; i < str.length; i++) {
//     str[i] = in.nextLine();
// }
// System.out.println(Arrays.toString(str));
// str[1] = "Prashant";
// System.out.println(Arrays.toString(str));
//! ARRAY PASSING IN FUNCTION
//     int[] nums = {3, 4, 5, 12};
//     System.out.println(Arrays.toString(nums));
//     change(nums);
//     System.out.println(Arrays.toString(nums));
// }
// static void change(int[] arr) {
//     arr[0] = 99;
// }
//! MULTIDIMENSIONAL ARRAYS
//   int[][] arr = new int[3][3];
//       int[][] arr = {
//              {1,2,3},
//              {4,5,6},
//              {7,8,9}
//       };
//       System.out.println(Arrays.toString(arr[2]));
// }
// String[] arr = new String[4];
// System.out.println(arr[0]);
// }
// int[] ros; // declaration of array. ros is getting defined in the stack
// ros = new int[5]; //Initialisation : actually here object is being created in the memory(heap)
//! Dynamic memory allocation = refers to the process of allocating memory storage during the runtime of a program. unlike static memory allocation, which allocates memory at compile time,It allows a program to request when it is needed and release it when it is no longer needed.
//! It occurs in the heap memory.
//! int[] arr = it occurs at compile time.
//! new int[5] = it occurs at runtime. (Dynamic memory allocation)
//! array objects are in heap
//! heap objects are not continuous.

//! 2D ARRAYS = type[][] arrayName = new type[rows][columns]
//! EXAMPLE = int[][] numbers = new int[3][2]
// import java.util.*;
// public class arrays {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int rows = in.nextInt();
//         int cols = in.nextInt();
//         int[][] numbers = new int[rows][cols];
// input
// rows
//         for(int i=0; i<rows; i++){
// columns
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = in.nextInt();
//             }
//         }
//output
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//! EXAMPLE-1
//! Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
// import java.util.*;

// public class arrays {

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int rows = in.nextInt();
//         int cols = in.nextInt();

//         int numbers[][] = new int[rows][cols];

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 numbers[i][j] = in.nextInt();
//             }
//         }

//         int x = in.nextInt();

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (numbers[i][j] == x) {
//                     System.out.println("X found at location:(" + i + "," + j + ") "); 
//                 }
//             }
//         }

//     }
// }

//! ArrayList

// import java.util.*;

// public class arrays {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(10);
//         list.add(25);
//         list.add(235);
//         list.add(215);
//         list.add(325);
//         list.add(25);
//         System.out.println(list);
//     }
// }

//! ASSIGNEMT

//! QUES-1
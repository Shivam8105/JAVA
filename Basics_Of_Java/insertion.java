package Basics_Of_Java;
//! Insert an element in array

// import java.util.*;

// public class insertion {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number of elements of the array: ");
//         int n = in.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = in.nextInt();
//         }
//         int x = 50;
//         int pos = 5;

//         int[] newArray = insertElement(arr, x, pos);
//         System.out.println(
//                 "The new array after insertion of " + x + " at position " + pos + " is: " + Arrays.toString(newArray));
//         in.close();
//     }

//     public static int[] insertElement(int[] arr, int x, int pos) {
//         int[] newArray = new int[arr.length + 1];
//         for (int i = 0; i < pos; i++) {
//             newArray[i] = arr[i];
//         }
//         newArray[pos] = x;
//         for (int i = pos; i < arr.length; i++) {
//             newArray[i + 1] = arr[i];
//         }
//         return newArray;
//     }
// }

//! Delete an element from an array

// import java.util.*;

// public class Deletion {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number of elements of the array: ");
//         int n = in.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = in.nextInt();
//         }
//         System.out.print("Enter the position of the element to delete: ");
//         int pos = in.nextInt();
//         int[] newArray = deleteElement(arr, pos);
//         System.out.println("The new array after deletion is: " + Arrays.toString(newArray));
//         in.close();
//     }

//     public static int[] deleteElement(int[] arr, int pos) {
//         int[] newArray = new int[arr.length - 1];
//         for (int i = 0; i < pos; i++) {
//             newArray[i] = arr[i];
//         }
//         for (int i = pos; i < arr.length - 1; i++) {
//             newArray[i] = arr[i + 1];
//         }
//         return newArray;
//     }
// }

//! Update an element in an array

// import java.util.*;

// public class Update {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number of elements of the array: ");
//         int n = in.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = in.nextInt();
//         }
//         System.out.print("Enter the position of the element to update: ");
//         int pos = in.nextInt();
//         System.out.print("Enter the new value: ");
//         int newValue = in.nextInt();
//         updateElement(arr, newValue, pos);
//         System.out.println("The updated array is: " + Arrays.toString(arr));
//         in.close();
//     }

//     public static void updateElement(int[] arr, int newValue, int pos) {
//         arr[pos] = newValue;
//     }
// }

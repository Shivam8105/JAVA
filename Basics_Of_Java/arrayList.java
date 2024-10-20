package Basics_Of_Java;
// import java.util.*;
// public class arrayList {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>(10);
// list.add(25);
// list.add(235);
// list.add(215);
// list.add(325);
// list.add(25);
// list.add(255);
// list.add(252);
// list.add(251);
// list.add(250);
// list.add(2549);

// System.out.println(list.contains(250)); 
// list.set(0, 99);

// list.remove(2);
// System.out.println(list);

//input

// for(int i = 0; i < 5; i++){
//     list.add(in.nextInt());
// }

// for(int i = 0; i < 5; i++){
//     System.out.println(list.get(i));;
// }
// System.out.println(list);

// initialisation

        // for(int i = 0; i < 3; i++){
        //     list.add(new ArrayList<>());
        // }

        //add elements
        // for(int i = 0; i < 3; i++){
        //     list.get(i).add(in.nextInt());
        // }
        // System.out.println(list);
//     }
// }

//! QUES-1 swapping values in array

// import java.util.Arrays;
// public class arrayList{
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 23, 9, 18};
//         swap(arr,1,3);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void swap(int[] arr, int index1, int index2){
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }
// }

//! QUES-2 maximum value of an array

// import java.util.Arrays;

// public class arrayList {
//         public static void main(String[] args) {
//                 int[] arr = {1, 3, 23, 9, 18};
//                 System.out.println(max(arr));
//         }
//          static int max(int[] arr){
//                 int maxVal = arr[0];
//                 for(int i = 0; i < arr.length; i++){
//                         if(arr[i] > maxVal){
//                                 maxVal = arr[i];
//                         }
//                 }
//                 return maxVal;
//         }
// }


//! QUES-3 reversing an array

// import java.util.Arrays;
// import java.util.Scanner;

// public class arrayList{
//         public static void main(String[] args) {
//                 Scanner in = new Scanner(System.in);
//                 System.out.println("Enter the array: ");
//                 int[] arr = new int[7];
//                 for(int i = 0; i < 7; i++){
//                         arr[i] = in.nextInt();
//                 }
//                 reverse(arr);
//                 System.out.println(Arrays.toString(arr));
//         }
//         static void reverse(int[] arr){
//                 int start = 0;
//                 int end = arr.length - 1;

//                 while(start < end){
                        //swap
//                         swap(arr, start, end);
//                         start++;
//                         end--;
//                 }
//         }
//         static void swap(int[] arr, int index1, int index2){
//                 int temp = arr[index1];
//                 arr[index1] = arr[index2];
//                 arr[index2] = temp;
//         }
// }

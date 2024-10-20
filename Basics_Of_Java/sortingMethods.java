package Basics_Of_Java;
//! Insertion Sort in Java

import java.util.*;
public class sortingMethods {
    static void insertion(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}


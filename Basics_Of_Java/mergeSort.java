package Basics_Of_Java;
import java.util.*;
public class mergeSort {
    public static void conquer(int arr[], int start, int mid, int end) {
        int mergedArray[] = new int[end - start + 1];
        int index_1 = start;
        int index_2 = mid + 1;
        int x = 0;
        while (index_1 <= mid && index_2 <= end) {
            if (arr[index_1] <= arr[index_2])
                mergedArray[x++] = arr[index_1++];
            else
                mergedArray[x++] = arr[index_2++];
        }

        while (index_1 <= mid) {
            mergedArray[x++] = arr[index_1++];
        }

        while (index_2 <= end) {
            mergedArray[x++] = arr[index_2++];
        }

        for (int i = 0, j = start; i < mergedArray.length; i++, j++) {
            arr[j] = mergedArray[i];
        }
    }

    public static void divide(int arr[], int start, int end) {
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2; // To calculate the mid of the array
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
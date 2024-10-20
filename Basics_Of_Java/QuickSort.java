package Basics_Of_Java;
// import java.util.*;

// public class quickSort {
//     public static void main(String[] args) {
//         int[] arr = {5, 4, 3, 2, 1};
//         sort(arr, 0, arr.length - 1);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void sort(int[] nums, int low, int high) {
//         if (low >= high) {
//             return;
//         }

//         int start = low;
//         int end = high;
//         int m = start + (end - start) / 2;
//         int pivot = nums[m];

//         while (start <= end) {
//             while (nums[start] < pivot) {
//                 start++;
//             }
//             while (nums[end] > pivot) {
//                 end--;
//             }
//             if (start <= end) {
//                 // Swap
//                 int temp = nums[start];
//                 nums[start] = nums[end];
//                 nums[end] = temp;
//                 start++;
//                 end--;
//             }
//         }
//         sort(nums, low, end);
//         sort(nums, start, high);
//     }
// }

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < pivot; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[],int low,int high){
        if(low < high){
            int pivotIdx = partition(arr,low,high);
            quickSort(arr,low,pivotIdx - 1);
            quickSort(arr,pivotIdx + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
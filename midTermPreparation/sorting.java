package midTermPreparation;

// import java.util.Arrays;
import java.util.Scanner;

//! insertion sort

// public class sorting {
//     static void insertion(int[] arr){
//         for(int i = 0; i < arr.length - 1; i++){
//             for(int j = i + 1; j > 0; j--){
//                 if(arr[j] < arr[j - 1]){
//                     int temp = arr[j - 1];
//                     arr[j - 1] = arr[j];
//                     arr[j] = temp;
//                 }else{
//                     break;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {5,4,3,2,1};
//         insertion(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }


//! selection sort

// public class sorting{
//     static int getMaxIndex(int arr[],int start,int end){
//         int max = start;
//         for(int i = 0; i <= end; i++){
//             if(arr[max] < arr[i]){
//                 max = i;
//             }
//         }
//         return max;
//     }

//     static void swap(int arr[],int first,int second){
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }

//     static void selection(int arr[]){
//         for(int i = 0; i <= arr.length - 1; i++){
//             int last = arr.length - i - 1;
//             int maxIndex = getMaxIndex(arr, 0, last);
//             swap(arr,maxIndex,last);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {5,4,3,2,1};
//         selection(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }


//! bubble sort

// public class sorting{
//     static void bubble(int arr[]){
//         for(int i = 0; i < arr.length - 1; i++){
//             for(int j = 1; j < arr.length - i; j++){
//                 if(arr[j] < arr[j - 1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j - 1];
//                     arr[j - 1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {5,4,3,2,1};
//         bubble(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//! quick sort

// public class sorting{
//     static void quicksort(int arr[],int low, int high){
//         if(low < high){
//             int pivotIndex = Partition(arr,low,high);
//             quicksort(arr, low, pivotIndex - 1);
//             quicksort(arr, pivotIndex + 1, high);
//         }
//     }

//     static int Partition(int[] arr, int low, int high){
//         int pivot = arr[high];
//         int i = low - 1;
//         for(int j = low; j < high; j++){
//             if(arr[j] < pivot){
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;
//         return i + 1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {7,6,5,4,3,2,1};
//         quicksort(arr, 0, arr.length - 1);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//! merge sort

public class sorting{
    static void conquer(int arr[],int mid,int start,int end){
        int[] mergedArray = new int[end - start + 1];
        int index_1 = start;
        int index_2 = mid + 1;
        int x = 0;
        while(index_1 <= mid && index_2 <= end){
            if(arr[index_1] <= arr[index_2]){
                mergedArray[x++] = arr[index_1++];
            }else{
                mergedArray[x++] = arr[index_2++];
            }
        }
        while(index_1 <= mid){
            mergedArray[x++] = arr[index_1++];
        }

        while(index_2 <= end){
            mergedArray[x++] = arr[index_2++];
        }

        for(int i = 0, j = start; i < mergedArray.length; i++,j++){
            arr[j] = mergedArray[i];
        }
    }

    static void divide(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, mid, start, end);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int n = arr.length;
        divide(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        in.close();
    }
}
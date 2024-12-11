package midTermPreparation;

//! Binary Search in java

// public class searching {
//     static int binarySearch(int[] arr, int target){
//         int low = 0; 
//         int high = arr.length - 1;

//         while(low <= high){
//             int mid = low + (high - low) / 2;
//             if(arr[mid] == target){
//                 return mid;
//             }else if(arr[mid] < target){
//                 low = mid + 1;
//             }else{
//                 low = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7};
//         int target = 7;
//         int result = binarySearch(arr, target);
//         if(result != -1){
//             System.out.println("Element found at index " + result);
//         }else{
//             System.out.println("Element not found");
//         }
//     }
// }


//! Linear Search in java

// public class searching{
//     static int linearSearch(int[] arr, int target){
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,4,3,2,1};
//         int target = 3;
//         int result = linearSearch(arr,target);
//         if(result != -1){
//             System.out.println(result);
//         }else{
//             System.out.println("Element not found");
//         }
//     }
// }


//! indexed sequential search


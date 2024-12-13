package midTermPreparation;

// import java.util.Arrays;

// import java.util.Arrays;

// import java.util.Arrays;

//! quick sort

// import java.util.Arrays;

// public class revision{
//     static void quicksort(int[] arr, int low, int high){
//         if(low < high){
//             int pivotIndex = Partition(arr, low, high);
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
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;
//         return i + 1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {6,5,4,3,2,1};;
//         quicksort(arr, 0, arr.length - 1);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//! merge sort

// public class revision{
//     static void conquer(int arr[], int mid, int start, int end){
//         int[] mergedArray = new int[end - start + 1];
//         int index_1 = start;
//         int index_2 = mid + 1;
//         int x = 0;
//         while(index_1 <= mid && index_2 <= end){
//             if(arr[index_1] <= arr[index_2]){
//                 mergedArray[x++] = arr[index_1++];
//             }else{
//                 mergedArray[x++] = arr[index_2++];
//             }
//         }
//         while (index_1 <= mid) {
//             mergedArray[x++] = arr[index_1++];
//         }

//         while(index_2 <= end){
//             mergedArray[x++] = arr[index_2++];
//         }

//         for(int i = 0, j = start; i < mergedArray.length ; i++, j++){
//             arr[j] = mergedArray[i];
//         }
//     }

//     static void divide(int[] arr, int start, int end){
//         if(start >= end){
//             return;
//         }
//         int mid = start + (end - start) / 2;
//         divide(arr, start, mid);
//         divide(arr, mid + 1, end);
//         conquer(arr, mid, start, end);
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,4,3,2,1};
//         divide(arr, 0, arr.length - 1);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//! tower of hanoi

// public class revision {
//     public static void solve(int n, int fromTower, int toTower, int auxTower1, int auxTower2, int auxTower3) {
//         if (n == 1) {
//             System.out.println("Move disk  1 from tower " + fromTower + " to tower " + toTower);
//             return;
//         }
//         solve(n - 1, fromTower, auxTower1, auxTower2, auxTower3, toTower);
//         System.out.println("move disc " + n + " from tower " + fromTower + " to tower " + toTower);
//         solve(n - 1, auxTower1, toTower, fromTower, auxTower2, auxTower3);
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         int fromTower = 1;
//         int toTower = 5;
//         int auxTower1 = 2;
//         int auxTower2 = 3;
//         int auxTower3 = 4;
//         System.out.println("Moves to solve tower of hanoi with " + n + " discs and 5 towers ");
//         solve(n, fromTower, toTower, auxTower1, auxTower2, auxTower3);
//     }
// }

//! sparse matrices

// public class revision{
//     public static void main(String[] args) {
//         int[][] arr = 
//         {
//             {0,0,3,0,4},
//             {0,0,5,7,0},
//             {0,0,0,0,0},
//             {0,2,6,0,0}
//         };
//         int size = 0;

//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr[i].length; j++){
//                 if(arr[i][j] != 0){
//                     size++;
//                 }
//             }
//         }

//         int compactMatrix[][] = new int[3][size];
//         int k = 0;
//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr[i].length; j++){
//                 if(arr[i][j] != 0){
//                     compactMatrix[0][k] = i;
//                     compactMatrix[1][k] = j;
//                     compactMatrix[2][k] = arr[i][j];
//                     k++;
//                 }
//             }
//         }

//         for(int i = 0; i < 3; i++){
//             for(int j = 0; j < size; j++){
//                 System.out.print(compactMatrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//! selection sort

// public class revision{
//     static int getMaxIndex(int[] arr, int start, int end){
//         int max = start;
//         for(int i = 0; i <= end; i++){
//             if(arr[max] < arr[i]){
//                 max = i;
//             }
//         }
//         return max;
//     }

//     static void swap(int[] arr, int first, int second){
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }

//     static void selection(int arr[]){
//         for(int i = 0; i <=  arr.length - 1; i++){
//             int last = arr.length - i - 1;
//             int maxIndex = getMaxIndex(arr, 0, last);
//             swap(arr, maxIndex, last);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {5,4,3,2,1};
//         selection(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//! bubble sort

// public class revision{
//     static void bubble(int[] arr){
//         for(int i = 0; i < arr.length; i++){
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
//         int[] arr = {5,4,3,2,1};
//         bubble(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//! insertion sort

// public class revision{
//     static void insertion(int[] arr){
//         for(int i = 0; i < arr.length - 1; i++){
//             for(int j = i + 1; j > 0 ; j--){
//                 if(arr[j] < arr[j - 1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j - 1];
//                     arr[j - 1] = temp;
//                 }else{
//                     break;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,4,3,2,1};
//         insertion(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//! fibonaaci using recursion

// public class revision{
//     static int fibonaaci(int n){
//         if(n <= 1){
//             return n;
//         }
//         return fibonaaci(n - 1) + fibonaaci(n - 2);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 0; i <= n; i++){
//             System.out.println(fibonaaci(i) + " ");
//         }
//         System.out.println();
//     }
// }


//! binary search

// public class revision{
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
//         int arr[] = {5,10,15,20,25};
//         System.out.println(binarySearch(arr, 20));
//     }
// }

//! reverse of a linked list

// public class revision{
//     static class node{
//         int data;
//         node next;
//         node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static void main(String[] args) {
//         node n1 = new node(10);
//         node n2 = new node(20);
//         node n3 = new node(30);
//         node n4 = new node(40);
//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;

//         System.out.println("singly linked list before traversal: ");
//         traversal(n1);

//         node n = reversenode(n1);
//         traversal(n);
//     }
//     public static void traversal(node head){
//         node current = head;
//         while(current != null){
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }

//     public static node reversenode(node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         node prevNode = null;
//         node current = head;
//         while(current != null){
//             node nextNode = current.next;
//             current.next = prevNode;
//             prevNode = current;
//             current = nextNode;
//         }
//         return prevNode;
//     }
// }

//! to find the second largest element in an array

// public class revision{
//     public static void main(String[] args) {
//         int[] arr = {23,45,55,34,70};
//         if(arr.length < 2){
//             System.out.println("Not enough elements");
//         }
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;
//         for(int num : arr){
//             if(num > largest){
//                 secondLargest = largest;
//                 largest = num;
//             }else if(secondLargest > num && num != largest){
//                 secondLargest = num;
//             }
//         }
//         if(secondLargest == Integer.MIN_VALUE){
//             System.out.println("No second largest element found");
//         }else{
//             System.out.println("The second largest element is: " + secondLargest);
//         }

//     }
// }
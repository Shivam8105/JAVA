package Basics_Of_Java;
import java.util.*;
public class selectionSort {
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i = 0; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        selection(arr);
        System.out.println("The sorted array using selection sort is : " + Arrays.toString(arr));
    }
}

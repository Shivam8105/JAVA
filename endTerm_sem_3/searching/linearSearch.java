package searching;

public class linearSearch {
    public static int search(int[] arr,int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index " + i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {11,21,23,34,45,56,67};
        int target = 34;
        search(arr, target);
    }
}

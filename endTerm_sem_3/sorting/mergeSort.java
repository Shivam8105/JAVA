package sorting;

public class mergeSort {
    public static void conquer(int[] arr, int start, int mid, int end){
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

        for(int i = 0,j = start; i < mergedArray.length; i++,j++){
            arr[j] = mergedArray[i];
        }
    }
    public static void divide(int[] arr, int start, int end){
        if(start <= end){
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr,start,mid);
        divide(arr,mid + 1,end);
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        divide(arr,0,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

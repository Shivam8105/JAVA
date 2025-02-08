package sorting;

public class quickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < pivot; j++){
            if(arr[j] < pivot){
                i++;
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

    public static void sort(int[] arr, int low, int high){
        if(low < high){
            int pivotIdx = partition(arr,low,high);
            sort(arr,low,pivotIdx - 1);
            sort(arr,pivotIdx + 1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        sort(arr,0,n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

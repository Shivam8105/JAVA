package searching;

public class recursiveBinarySearch {
    static int binarySearch(int arr[], int left, int right, int target) {
        if (left > right) {
            return -1; // Element not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72};
        int target = 23;
        int result = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println(result != -1 ? "Element found at index " + result : "Element not found");
    }
}

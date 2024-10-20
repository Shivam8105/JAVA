package Basics_Of_Java;
// public class SimpleIndexSequentialSearch {
//     // Function to perform index sequential search
//     public static int indexSequentialSearch(int[] arr, int key) {
//         int n = arr.length;

//         // Create index for block size of 2
//         for (int i = 0; i < n; i += 2) {
//             // Check if the key is in the current index block
//             if (arr[i] == key) {
//                 return i; // Found at index
//             } else if (i + 1 < n && arr[i + 1] == key) {
//                 return i + 1; // Found at the next index
//             } else if (arr[i] > key) {
//                 break; // Key not in this block
//             }
//         }

//         // Linear search in the last block
//         for (int j = 0; j < n; j++) {
//             if (arr[j] == key) {
//                 return j; // Found at index
//             }
//         }

//         return -1; // Not found
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
//         int key = 70;

//         int result = indexSequentialSearch(arr, key);
//         if (result != -1) {
//             System.out.println("Element found at index: " + result);
//         } else {
//             System.out.println("Element not found.");
//         }
//     }
// }


class SimpleHashTable {
    private String[] table;

    public SimpleHashTable(int capacity) {
        table = new String[capacity];
    }

    private int hash(int key) {
        return key % table.length; // Simple hash function
    }

    public void insert(int key, String value) {
        int index = hash(key);
        table[index] = value; // Store value at computed index
    }

    public String search(int key) {
        int index = hash(key);
        return table[index]; // Retrieve value from computed index
    }

    public static void main(String[] args) {
        SimpleHashTable hashTable = new SimpleHashTable(10);

        // Inserting key-value pairs
        hashTable.insert(1, "One");
        hashTable.insert(2, "Two");

        // Searching for values
        System.out.println("Key 1: " + hashTable.search(1)); // Output: One
        System.out.println("Key 2: " + hashTable.search(2)); // Output: Two
        System.out.println("Key 3: " + hashTable.search(3)); // Output: null
    }
}



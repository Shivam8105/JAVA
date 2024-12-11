package midTermPreparation;

//! tower of hanoi

// public class recursion {
//     static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
//         if (n == 0) {
//             return;
//         }
//         towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
//         System.out.println("Move disk " + n + " from disk " + from_rod + " to rod " + to_rod);
//         towerOfHanoi(n - 1, aux_rod, from_rod, to_rod);
//     }
//     public static void main(String[] args) {
//         towerOfHanoi(5, 'a', 'c', 'b');
//     }
// }

//! using head recursion for finding the factorial of a number

// public class recursion{
//     public static int factorial(int n) {
//         if(n == 0){
//             return 1;
//         }
//         int smallerFactorial = factorial(n - 1);
//         int result = n * smallerFactorial;
//         return result;
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }

//! fibonaaci using recursion

// public class recursion {
//     public static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         return fibonacci(n - 1) + fibonacci(n - 2);
//     }

//     public static void main(String[] args) {
//         int n = 5; 
//         for(int i = 0 ; i <= n; i++){
//             System.out.println(fibonacci(i) + " ");
//         }
//     }
// }


package Basics_Of_Java;
//! automorphic number

// public class autoMorphic{
//     public static void main(String[] args) {
//          int num = 12;
//          int square = num * num;
//          System.out.println(numAtuo(num, square));
//     }
    
//     public static boolean numAtuo(int num, int square){
//         while(num != 0){
//             if(num % 10 != square % 10){
//                 return false;
//             }
//             num /= 10;
//             square /= 10;
//         }
//         return true;
//     }
// }

//! perfect square

// public class perfectSquare{

//     public static boolean square(int num){
//         int x = (int)Math.sqrt(num);
//         int perfect = x * x;
//         if(perfect == num){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(square(25));
//     }
// }

//! Harshad number

// public class harshad{
//     public static boolean HarshadNumber(int num){
//         int sum = 0;
//         int temp = num;
//         while(num > 0){
//             int last_digit = num % 10;
//             sum = sum + last_digit;
//             num /= 10;
//         }
//         if(temp % sum == 0){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(HarshadNumber(31));
//     }
// }

//! Friendly Pair

import java.util.Scanner;

public class FriendlyPair{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int sum_2 = 0;
        in.close();
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        for(int j = 1; j < m; j++){
            if(m % j == 0){
                sum_2 += j;
            }
        }
        if(sum % n == sum_2 % m){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
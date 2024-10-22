package LearningJava;

//! unary operators

// public class operators {
//     public static void main(String[] args) {
//         int a = 10; 
//         int b = 0;
//         //! pre increment
// b = ++a;
//         //! post increment
// b = a++;
//         //! pre increment
// b = --a;
//         //! post increment
// b = a--; 
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

//! left and right shift
// public class operators {
//     public static void main(String[] args) {
//         int a = 0101;
//         int b = 0110;

//         System.out.println(a >> 8);
//         System.out.println(b >> 8);
//     }
// }

//! bit manipulation
//! Getting the Bit.

// public class operators {
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 3;
//         int Bitmask = 1 << pos;
//         if((Bitmask & n) == 0){
//             System.out.println("Bit was 0.");
//             return;
//         }
//         System.out.println("Bit was 1");
//     }
// }

//! Setting the bit

// public class operators {
//          public static void main(String[] args) {
//                 int n = 5; //0101
//                 int pos = 1;
//                 int Bitmask = 1 << pos;
//                 int newBit = Bitmask | n;
//                 System.out.println(newBit);
//         }
// }

//! Clear Bit

public class operators {
        public static void main(String[] args) {
                int n = 5;
                int pos = 2;
                int Bitmask = 1 << pos;
                int newBit = ~(Bitmask);
                int newBit_2 = (newBit & n);
                System.out.println(newBit_2);
        }
}

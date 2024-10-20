package Basics_Of_Java;
//! IF STATEMENTS DETAIL

// public class condition {

    // public static void main(String[] args) {
        /*
         Syntax of if statements:
         if(boolean expression T or F) {
            body
         }else{
            do this
         }
         */
        // int salary = 25000;
        // if(salary > 10000) {
        //     salary += 2000;
        // }
        // else{
        //     salary += 1000;
        // }
        // System.out.println(salary);

//         if (salary > 10000) {
//             salary += 2000;
//         } else if (salary > 20000) {
//             salary += 3000;
//         } else {
//             salary += 1000;
//         }
//         System.out.println(salary);
//     }
// }

//! LOOPS
//! FOR LOOP = 
            //!  Syntax = for(initialization; condition; increment/decrement){
            //!         body
            //!  }


// public class condition {
//    public static void main(String[] args) {
//       int i = 1;
//       for( i = 1; i <= 5 ; i++){
//          System.out.println(i);
//       }
//    }
// }

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       System.out.print("Input a number: ");
//       int n = input.nextInt();

//       for(int num = 1; num <= n; num++) {
//          System.out.println(num + " ");
//       }
//    }
// }

//! WHILE LOOP = 
/*Syntax:
    while(condition) {
      //   body
   }
 */

// public class condition {
//    public static void main(String[] args) {
//       int num = 1;
//       while (num <= 5) {
//          System.out.println(num);
//          num++;
//       }
//    }
// }


//! do while loop = 

/*
 do {
    body
}while (condition);
 */


// public class condition {
//    public static void main(String[] args) {
//       int n = 1;
//       do {
//          System.out.println(n);
//          n++;
//       }
//       while(n <= 5);
//    }
// }

//! TO FIND THE LARGEST OF THREE NUMBERS

// import java.util.Scanner;

// public class condition  {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter 3 numbers: ");
//       int a = in.nextInt();
//       int b = in.nextInt();
//       int c = in.nextInt();

//       if(a > b && a > c){
//          System.out.println("a is the largest");
//       }
//       else if (b > a && b > c) {
//           System.out.println("b is the largest");
//       }
//       else{
//          System.out.println("c is the largest");
//       }
//    }
// }

//! ALPHABET CASE CHECK

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter an alphabet : ");
//       char ch = in.next().trim().charAt(0);

//       if (ch >= 'a' && ch <= 'z') {
//          System.out.println("Lowercase");
//       }
//       else {
//          System.out.println("Uppercase");
//       }
//    }
// }

//! FIBONACCI NUMBERS

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       int n = in.nextInt();
//       int a = 0;
//       int b = 1;
//       int count = 2;
//       while (count <= n) {
//          int temp = b;
//          b = b + a;
//          a = temp;
//          count++;
//       }
//       System.out.println(b);
//    }
// }


//! COUNTING OCCURENCE

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter any number to count the number of occurence : ");
//       int num = in.nextInt();
//       int count = 0;
//       while(num > 0) {
//          int rem = num % 10;
//          if(rem == 3) {
//             count ++;
//          }
//          num = num / 10;
//       }
//       System.out.println(count);
//    }
// } 


//! REVERSE OF A NUMBER

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("enter any number: ");
//       int n = in.nextInt();
//       int reverse = 0;
//       while (n > 0) {
//          int digit = n % 10;
//          reverse = reverse * 10 + digit;
//          n = n / 10;
//       }
//       System.out.println("The reverse of a number is :" + reverse);
//    }
// }


//! CALCULATOR PROGRAM

//! already done in Main.java

//! QUES-1 Area Of Circle Java Program
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter the radius of the circle: ");
//       double radius = in.nextFloat();
//       double area = Math.PI * radius * radius;
//       System.out.println("The area of the circle is :" + area);

//    }
// }

//! QUES-2 Area Of Triangle

// import java.util.Scanner;
// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter the base of the triangle: ");
//       double base = in.nextFloat();
//       System.out.print("Enter the height of the triangle: ");
//       double height = in.nextFloat();
//       double area = 0.5 * base * height;
//       System.out.println("The area of the triangle is: " + area);
//    }
// }

//! QUES-3  AREA OF RECTANGLE 

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter the length of the rectangle: ");
//       int length = in.nextInt();
//       System.out.print("Enter the breadth of the rectangle: ");
//       int breadth = in.nextInt();
//       int area = length * breadth;
//       System.out.println("The area of the rectangle is :" + area); 
//    }
// }

//! QUES-4 AREA OF ISOSCELES TRIANGLE

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter the base of the triangle: ");
//       double base = in.nextFloat();
//       System.out.print("Enter the height of the triangle: ");
//       double height = in.nextFloat();
//       double area = 0.5 * base * height;
//       System.out.println("The area of the triangle is: " + area);
//    }
// }

//! QUES-5 AREA OF PARALLELOGRAM

// Base * height

//! QUES-6 AREA OF RHOMBUS

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter the length of first diagonal: ");
//       double d1 = in.nextDouble();
//       System.out.print("Enter the length of second diagonal: ");
//       double d2 = in.nextDouble();
//       double area = 0.5 * d1 * d2;
//       System.out.println("The area of the rhombus is: " + area);
//    }
// }

//! QUES-7 PERIMETER OF PARALLELOGRAM

//! 2 * (A + B)

//! QUES-8 PERIMETER OF RHOMBUS
//! 4 * (SIDE LENGTH)

//! VOLUME OF CONE JAVA PROGRAM

//! 1/3 * pie * radius * radius * height 

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter the radius of the cone(in metres): ");
//       double radius = in.nextDouble();
      
//       System.out.print("Enter the height of the cone(in meters): ");
//       double height = in.nextDouble();

//       double volume = (1.0/3.0) * Math.PI * radius * radius *  height;
//       System.out.println("The volume of the cone is : " + volume + "cubic metres");
//    }
// }

//! QUES- 9 SUBTRACT THE PRODUCT AND SUM OF DIGITS OF AN INTEGER

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("n = ");
//       int n = in.nextInt();
//       int sum = 0;
//       int product = 1;
//       while (n > 0) {
//          int digit = n % 10;
//          product = product * digit;
//          sum = sum + digit;
//          n = n / 10;
//       }
//       System.out.println("Product of digits = " + product);
//       System.out.println("Sum of digits = " + sum);
//       int result = product - sum;
//       System.out.println("Result = " + result);
//    }
// }


//! QUES-10 INPUT A NUMBER AND PRINT ALL THE FACTORS OF THAT NUMBER (USE LOOPS)

// import java.util.Scanner;

// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Enter any number to find it's factors: ");
//       int num = in.nextInt();
//       System.out.print("The factors of the " + num + " are: ");

//       for(int i = 1; i <= num ;i++){
//           if(num % i == 0){
//             System.out.print(i + " ");
//           }
//       }
//    }
// }

//! QUES-11 TAKE INTEGER INPUTS TILL THE USER ENTERS 0 AND PRINT THE SUM OF ALL NUMBERS (HINT: WHILE LOOP)

// import java.util.Scanner;
// public class condition {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int sum = 0;
//         int number;

//         System.out.println("Enter numbers to sum, enter 0 to finish: ");

//         while (true) { 
//             number = in.nextInt();
//             if(number == 0) {
//                 break;
//             }
//             sum += number;
//         }
//         System.out.println("The sum of all entered numbers is: " + sum);
//     }
// }

//! TAKE INTEGER INPUTS TILL THE USER ENTERS 0 AND PRINT THE LARGEST NUMBER FROM ALL.

// import java.util.Scanner;
// public class condition {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number and print the largest number from all: ");
//         int num = in.nextInt();
//         while(true) {
//             if
//         }
//     }
// }

//! FACTORIAL PROGRAM IN JAVA

// import java.util.Scanner;
// public class condition {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number to find the factorial: ");
//         int num = in.nextInt();
//         int m = num;
//         int factorial = 1;
//         if (num < 0) {
//             System.out.println("negative numbers are not allowed");
//         }
//         else{
//             while (num > 0) {
//                 factorial *=  num;
//                 num--;
//             }
//             System.out.println("The factorial of " + m + " is " + factorial);
//         }
//     }
// }


//! CALCULATE ELETRCITY BILL
 
// import java.util.Scanner;
// public class condition {
//    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.println("Enter the number of units consumed: ");
//       int units = in.nextInt();
//       double ratePerUnit = 5.0;
//       double totalBill = calculateBill(units,ratePerUnit);
//       System.out.println("The total electricity bill is: $" + totalBill);
//    }
//    public static double calculateBill(int units,double ratePerUnit) {
//       double bill = 0;

//       if(units <= 100){
//          bill = units * ratePerUnit;
//       } else if (units <= 200) {
//          bill = (100 * ratePerUnit) + ((units - 100) * ratePerUnit * 1.2);
//       }else {
//          bill = (100 * ratePerUnit) + (100 * ratePerUnit * 1.2) + ((units - 200) * ratePerUnit * 1.5);
//       }
//       return bill;
//    }
// }
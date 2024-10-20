package LearningJava;

// import java.util.*;

//! Print the name using the function

// import java.util.Scanner;

// public class lec2 {
//     public static void printName(String name){
//         System.out.println(name);
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String name = in.nextLine();
//         in.close();
//         printName(name);
//     }
// }

//! function to add two numbers

// public class lec2{
//     public static int sum(int a,int b){
//         return a + b;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number a: ");
//         int a = in.nextInt();
//         System.out.print("Enter the number b: ");
//         int b = in.nextInt();
//         in.close();
//         System.out.print(sum(a,b));
//     }
// }

//! function to multiply two numbers

// public class lec2 {
//     public static int multiply(int a,int b) {
//         return a * b;
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number a: ");
//         int a = in.nextInt();
//         System.out.print("Enter the number b: ");
//         int b = in.nextInt();
//         in.close();
//         System.out.print(multiply(a, b));
//     }
// }

//! function to find the factorial of a number

// public class lec2{
//     public static int findFactorial(int n){
//         int factorial = 1;
//         while(n > 0){
//             factorial = factorial * n;
//             n--;
//         }
//         return factorial;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = in.nextInt();
//         in.close();
//         System.out.print("The factorial of " + n + " is: " + findFactorial(n));
//     }
// }

//! Exercises

//! Enter 3 numbers from the user & make a function to print their average.

// public class lec2 {

//     static int findAverage(int a, int b, int c) {
//         return (a + b + c) / 3;
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = in.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = in.nextInt();
//         System.out.print("Enter the third number: ");
//         int c = in.nextInt();
//         in.close();
//         System.out.print("Your Average is: " + findAverage(a, b, c));
//     }
// }

//! Write a function to print the sum of all odd numbers from 1 to n.

// public class lec2{
//     static int oddNumbers(int n){
//         int sum = 0;
//         for(int i = 1; i <= n; i+=2){
//             sum += i;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = in.nextInt();
//         in.close();
//         System.out.print("Your Sum of odd numbers is: " + oddNumbers(n));
//     }
// }

//! Write a function that takes in the radius as input and returns the circumference of a circle.

// public class lec2{
//     static double circumference(int radius){
//         return 2 * Math.PI * radius;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the radius of the circle: ");
//         int radius = in.nextInt();
//         in.close();
//         System.out.print("Your circumference is: " + circumference(radius));
//     }
// }

//! Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// public class lec2{
//     static boolean Eligible(int age){
//         if(age >= 18){
//             return true;
//         }else return false;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = in.nextInt();
//         in.close();
//         System.out.print(Eligible(age));
//     }
// }

//! Write an infinite loop using do while condition.

// public class lec2{
//     public static void main(String[] args) {
//         do{
//             System.out.print("hello");
//         }while(true);
//     }
// }

//! Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

// public class lec2 {
//     public static void main(String[] args) {
//         int positive = 0, negative = 0, zero = 0;
//         Scanner in = new Scanner(System.in);

//         while (true) {
//             System.out.print("Enter 1 to continue or 0 to stop: ");
//             int input = in.nextInt();

//             if (input == 0) {
//                 break; 
//             } else if (input != 1) {
//                 System.out.println("Invalid input. Please enter 1 or 0.");
//                 continue; 
//             }

//             System.out.print("Enter the number: ");
//             int num = in.nextInt();
//             if (num > 0) {
//                 positive++;
//             } else if (num < 0) {
//                 negative++;
//             } else {
//                 zero++;
//             }
//         }

//         System.out.println("Positives: " + positive);
//         System.out.println("Negatives: " + negative);
//         System.out.println("Zeros: " + zero);
//         in.close();
//     }
// }

//! Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

// public class lec2{
//     public static int power(int x, int n){
//         int result = 1;
//         for(int i = 0; i < n; i++){
//             result = result * x;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the value of x: ");
//         int x = in.nextInt();
//         System.out.print("Enter the value of n: ");
//         int n = in.nextInt();
//         in.close();
//         System.out.println("x raised to the power of n is: " + power(x,n));
//     }
// }

//! Write a function that calculates the Greatest Common Divisor of 2 numbers. 

// public class lec2 {
//     public static int gcd(int a, int b) {
//         while(b != 0){
//         int temp = b;
//         b = a % b;
//         a = temp;
//         }
//         return a;
// while (b != a) {
//     if (b > a) {
//         b = b - a;
//     } else {
//         a = a - b;
//     }
//     System.out.println("GCD is: " + b);
// }
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a = in.nextInt();
//         System.out.print("Enter b: ");
//         int b = in.nextInt();
//         in.close();
//         System.out.println("The GCD of two numbers is: " + gcd(a, b));
//     }
// }

//! Write a program to print Fibonacci series of n terms where n is input by user :

// public class lec2{
//     static void fibonacci(int n){
//         int x = 0;
//         int y = 1;
//         System.out.println(x);
//         System.out.println(y);
//         for(int i = 3; i <= n; i++){
//             int z = x + y;
//             System.out.println(z);
//             x = y;
//             y = z;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = in.nextInt();
//         in.close();
//         System.out.println("The fibonacci series till " + n + " is " );
//         fibonacci(n);
//     }
// }

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = getValidIntInput(scanner);
        int numSubjects = getValidIntInput(scanner);

        String[] studentNames = new String[numStudents];
        double[][] grades = new double[numStudents][numSubjects];
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1));
            studentNames[i] = scanner.next();
            for (int j = 0; j < numSubjects; j++) {
                System.out.print((j + 1));
                grades[i][j] = getValidDoubleInput(scanner);
            }
        }

        double[] averageGrades = new double[numStudents];
        double highestGrade = Double.NEGATIVE_INFINITY;
        double lowestGrade = Double.POSITIVE_INFINITY;
        String highestGradeStudent = "";
        String lowestGradeStudent = "";

        System.out.println("\nAverage Grades:");
        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += grades[i][j];
            }
            averageGrades[i] = sum / numSubjects;
            System.out.printf("%s: %.2f%n", studentNames[i], averageGrades[i]);
            for (double grade : grades[i]) {
                if (grade > highestGrade) {
                    highestGrade = grade;
                    highestGradeStudent = studentNames[i];
                }
                if (grade < lowestGrade) {
                    lowestGrade = grade;
                    lowestGradeStudent = studentNames[i];
                }
            }
        }

        System.out.printf("Highest Grade: %.2f (%s)%n", highestGrade, highestGradeStudent);
        System.out.printf("Lowest Grade: %.2f (%s)%n", lowestGrade, lowestGradeStudent);

        scanner.close();
    }

    private static int getValidIntInput(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0) {
                    return input;
                } else {
                    System.out.print("Please enter a positive integer: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a positive integer: ");
                scanner.next(); 
            }
        }
    }

    private static double getValidDoubleInput(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                if (input >= 0) {
                    return input;
                } else {
                    System.out.print("Please enter a non-negative grade: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a non-negative grade: ");
                scanner.next();
            }
        }
    }
}

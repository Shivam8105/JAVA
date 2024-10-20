package Basics_Of_Java;

//         Scanner in = new Scanner(System.in);
//         String fruit = in.nextLine();
//         switch (fruit) {
//             case "Mango" -> System.out.println("King of fruits");
//             case "Apple" -> System.out.println("A sweet red fruit");
//             case "Orange" -> System.out.println("Round fruit");
//             case "Grapes" -> System.out.println("Small fruit");
//             default -> System.out.println("Please enter a valid fruit");
//         }
//     }
// }


// public class Shivam {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int day = in.nextInt();
//         switch (day) {
//             case 1 -> System.out.println("Monday");
//             case 2 -> System.out.println("Tuesday");
//             case 3 -> System.out.println("Wednesday");
//             case 4 -> System.out.println("Thursday");
//             case 5 -> System.out.println("Friday");
//             case 6 -> System.out.println("Saturday");
//             case 7 -> System.out.println("Sunday");
//             default -> System.out.println("Please enter a valid day");
//         }
//     }
// }
//! NESTED CASE


// import java.util.Scanner;

// public class Shivam {

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int empID = in.nextInt();
//         in.nextLine(); 
//         String department = in.nextLine();

//         switch (empID) {
//             case 1 -> System.out.println("Shivam Kumar");
//             case 2 -> System.out.println("Prashant Kumar");
//             case 3 -> {
//                 System.out.println("Ritik Kumar");
//                 switch (department) {
//                     case "IT" -> System.out.println("IT Department");
//                     case "Management" -> System.out.println("Management Department");
//                     case "Accounts" -> System.out.println("Account Department");
//                     default -> System.out.println("No Department entered");
//                 }
//             }
//             default -> System.out.println("Please enter correct employee Id");
//         }
//     }
// }


import java.util.Scanner;
public class fibonaaci{
    public static int fib(int n){
        if(n <= 1) return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(fib(i) + " ");
        }
        in.close();
    }
}


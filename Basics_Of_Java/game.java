package Basics_Of_Java;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        divisible(n);
        in.close();
    }

    static void divisible(int num) {
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("fizz-buzz");
        } else if (num % 3 == 0) {
            System.out.println("buzz");
        } else if (num % 5 == 0 ) {
            System.out.println("fizz");
        } else {
            System.out.println("invalid value");
        }
        return;
    }
}

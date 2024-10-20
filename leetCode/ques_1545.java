package leetCode;

import java.util.Scanner;

class ques_1545 {
    public char findKthBit(int n, int k) {
        String s0 = "0";
        for (int i = 0; i < n; i++) {
            s0 = s0 + "1" + reverse(invert(s0));
        }
        return s0.charAt(k - 1);
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String invert(String str) {
        String inverted = "";
        for (char c : str.toCharArray()) {
            inverted += (c == '0') ? "1" : "0";
        }
        return inverted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ques_1545 solution = new ques_1545();
        char result = solution.findKthBit(n, k);
        System.out.print(result);
        scanner.close();
    }
}

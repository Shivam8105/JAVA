package LearningJava;

// import java.util.*;
// public class strings {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         //! Using String Constructor
//         String str1 = new String("Hello Shivam");
//         System.out.println(str1);
//         //! Using String Literal
//         String str2 = "Bola Toh Hello";
//         System.out.println(str2);
//         //! Concatenation of Strings
//         String add = str1 + " " + str2;
//         System.out.println(add);
//         //! Length of String
//         int len = add.length();
//         System.out.println(len);
//         //! Substring = Part of a larger String (start,end - 1)
//         String sub = add.substring(3, 12);
//         System.out.println(sub);
//         //! charAt()- It is used to Access individual Characters.
//         char ch = str1.charAt(6);
//         System.out.println(ch);
//         //! toUpperCase - converts string to uppercase sequence
//         String str3 = str1.toUpperCase();
//         System.out.println(str3); 
//         //! toLowerCase - converts string to lowercase sequence
//         String str4 = str1.toLowerCase();
//         System.out.println(str4);
//         //! trim - It is used to remove leading and trailing whitespaces.
//         String str6 = "    whitespacesRemoved   ";
//         String str5 = str6.trim();
//         System.out.println(str5);
//         //! compareTo() - Used to compare String.
//         if(str1.compareTo(str2) == 0) System.out.println("They are equal");
//         else System.out.println("They are not equal");
//         in.close();
//     }
// }


//! reverse of a string

public class strings{
    public static void main(String[] args) {
        String str = "tuhC";
        int start = 0;
        int end = str.length() - 1;
        StringBuilder reverse = new StringBuilder();
        while(start <= end){
            reverse.append(str.charAt(end));
            end--;
        }
        System.out.println(reverse.toString());
    }
}
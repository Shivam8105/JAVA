package LearningJava;

import java.util.ArrayList;

public class hello{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("oragne");
        fruits.add("hello");
        fruits.add("buffalo");
        
        System.out.println("original arraylist: " + fruits);
        System.out.println("Element at index 2: " + fruits.get(2));
        
        fruits.set(1,"Blueberry");
        System.out.println("After modification: " + fruits);
        fruits.remove(3);
        System.out.println("After removal: " + fruits);
        fruits.remove("Apple");
        System.out.println("After removing 'Apple'" + fruits);
    }
}
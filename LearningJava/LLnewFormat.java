package LearningJava;


import java.util.*;
public class LLnewFormat {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
    
        list.addFirst("Shivam");
        list.addLast("Kumar");
        list.addFirst("is");
        list.addFirst("This");

        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list);
        // System.out.println(list.size());

        // list.removeLast();
        // System.out.println(list);
        // System.out.println(list.size());

        list.remove(3);
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }
    //! if(list.get(i) == value){}
}

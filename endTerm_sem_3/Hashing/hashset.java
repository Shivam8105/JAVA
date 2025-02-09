package Hashing;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(50);
        System.out.println(set.contains(10));
        System.out.println(set.contains(30));
        set.remove(20);

        for(int num : set){
            System.out.println(num);
        }
    }


}

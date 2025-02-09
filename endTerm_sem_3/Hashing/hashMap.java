package Hashing;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();

        map.put("Shivam",20);
        map.put("Khushi",19);
        map.put("Satyam",20);

        System.out.println("Khushi's age: " + map.get("Khushi"));

        if(map.containsKey("Khushi")){
            System.out.println("Khushi is present in the map");
        }

        map.remove("Satyam");

        for(String key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

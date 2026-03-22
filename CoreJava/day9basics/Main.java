package CoreJava.day9basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(20);
        list.add(3);
        list.add(null);
        list.add(null);
        System.out.println("Printing list: " + list);
        
        Set<Integer> set = new HashSet<>();
        set.add(19);
        set.add(21);
        set.add(2);  
        set.add(2);
        set.add(null);
        set.add(null);   
        System.out.println("Printing set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(1, "One");
        map.put(1, "Uno");
        map.put(null, "NullKey");
        map.put(null, "NullKeyUpdated");
        System.out.println("Printing map: " + map);
    }
}

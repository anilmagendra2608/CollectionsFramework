package HashMapConcept;

import java.util.HashMap;
import java.util.HashSet;

public class CompareTwoHashMaps {
    public static void main(String args[]) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1, "A");
        map3.put(1, "B");// ignoring this as duplication not allowed in HashMap
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(3, "D");// ignoring this as duplication not allowed in HashMap

        // 1. Comparison on the basis of KEY-VALUE pair - using equals() method
        System.out.println("Is map1 and map2 are equal? " + map1.equals(map2)); // True
        System.out.println("Is map2 and map3 are equal? " + map2.equals(map3)); // False
        System.out.println("Is map1 and map3 are equal? " + map3.equals(map1)); // False

        // 2. Comparison on the basis of KEYS - Using KeySet()
        System.out.println("Using KeySet() map1 and map3 are equal? = " + map1.keySet().equals(map3.keySet())); //True

        // 3. Find an extra key among 2 Hashmaps
        HashMap<Integer, String> map4 = new HashMap<Integer, String>();
        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "E"); // This is extra key we need to find
        HashSet<Integer> CombineKeys = new HashSet<Integer>(map1.keySet());

    }
}

package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[]) {
        // no ordering No indexing
        // no duplicate keys
        HashMap<String, String> testHashMap = new HashMap<String, String>();
        testHashMap.put("101", "Anil");
        testHashMap.put("102", "Naveen");
        testHashMap.put("103", "Rahul");
        testHashMap.put("104", "Karthik");
        testHashMap.put("101", "Anil");
        System.out.println(testHashMap.get("101"));

        // Can Store n number of null Values But ONLY one Null Key
        // it wont give any error if we store more than 1 null KEYS it will display latest value
        testHashMap.put(null, "TestValue1");
        testHashMap.put(null, "TestValue2");
        System.out.println(testHashMap.get(null)); // will display TestValue2

        // multiple no of null values can be stored
        testHashMap.put("105", null);
        testHashMap.put("106", null);
        System.out.println(testHashMap.get("105")); // will display null
        System.out.println(testHashMap.get("106")); // will display null

        // hashMap is Not Synchronized - Not Thread Safe
        // Iterator : over the keys : by using keySet()
        Iterator<String> it = testHashMap.keySet().iterator();
        System.out.println("Iterator by using keySet()");
        while(it.hasNext()) {
            String key = it.next();
            String value = testHashMap.get(key);
            System.out.println("Key = " + key + " Value=" + value);
        }

        // Iterator using entrySet()
        Iterator<Map.Entry<String, String>> it1 = testHashMap.entrySet().iterator();
        System.out.println("Iterator by using entrySet()");
        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key = " +key + "Value = " +value);
        }

        // Iterate using Java8 foreach and lambda
        System.out.println("Iterator by using lambda and foreach");
        testHashMap.forEach((k,v) -> System.out.println("Key = " + k + " Value= " +v));
    }
}

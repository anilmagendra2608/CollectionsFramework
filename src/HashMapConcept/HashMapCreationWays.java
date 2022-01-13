package HashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Refer https://beginnersbook.com/java-collections-tutorials/
public class HashMapCreationWays {

    public static void main(String args[]) {
        //1. Using HashMap Class
        HashMap<String, String> testHM = new HashMap<>();
        Map<String, Object> map = new HashMap<String, Object>();

        // 2. Immutable Map With only single Entry
        Map<String, Integer> immutableMap = Collections.singletonMap("test", 100);
        System.out.println("Values in Immutable Map = " + immutableMap.get("test"));
//        immutableMap.put("test1", 123); // this will throw error because For Immutable map you can enter values at single entry only
        // you cant change or update the map - UnsupportedOperationException

        // 3. JDK 8: Create 2d Array of Strings using stream and collecting in the form of Map
        Map<String, String> map4 = Stream.of(new String[][]
                {
                        {"Tom", "Brisbane"},
                        {"Lisa", "Sydney"},
                }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        System.out.println(map4.get("Tom"));
        map4.put("Cindy", "Melbourne");
        System.out.println(map4);

    }
}

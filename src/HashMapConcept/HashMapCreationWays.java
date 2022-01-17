package HashMapConcept;

import com.google.common.collect.ImmutableMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Refer https://beginnersbook.com/java-collections-tutorials/
public class HashMapCreationWays {

    public static void main(String args[]) {
        // Different Ways of Creating HashMap and using it.
        // 1. Using HashMap Class
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

        // 4. Using SimpleEntry: Example of Immutable Map
        Map<String, String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("testKey1", "testValue1"),
                new AbstractMap.SimpleEntry<>("testKey2", "testValue2"),
                new AbstractMap.SimpleEntry<>("testKey3", "testValue3")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Using SimpleEntry Concept Value returned from Map = " + map5.get("testKey1"));
        map5.put("testKey4", "testValue4");
        System.out.println("Using SimpleEntry Concept Value returned from Map = " + map5.get("testKey4"));

//        // 5. From JDK 1.9 = Use JDK 1.9 to run below code -> now using jdk 1.8
//        // Empty map (JDK1.9)
//        Map<String, String> emptyMap = Map.of();
//        emptyMap.put("tom", "jerry"); // this will throw error UnsupportedOperationException as for empty Map we cant add value like this
//
//        // 6. Singleton Map (JDK1.9)
//        Map<String, String> singletonMap = Map.of("K1", "V1");
//        System.out.println(singletonMap.get("K1"));
////        singletonMap.put("K2", "V2"); // UnsupportedOperationException
//
//        // 7. MultiValue Map (JDK 1.9) => Max 10 pairs can be stored with this multiMap = limitation (JDK1.9)
//        Map<String, String> multiMap = Map.of("K1", "V1", "K2", "V2", "K3", "V3");
//        System.out.println(multiMap.get("K3"));
//
//        // 8. Using ofEntries (JDK1.9) // this will again generate ImmutableMap = cant put any new values
//        Map<String, String> map7 = Map.ofEntries(
//                new AbstractMap.SimpleEntry<>("A", "100"),
//                new AbstractMap.SimpleEntry<>("B", "200"),
//                new AbstractMap.SimpleEntry<>("C", "300")
//        );
//        map7.get("A"); // will print 100
////        map7.put("D","500"); // this will throw error UnsupportedOperationException


        // 9. Maps Using Guava(Google) Library
        Map<String, String> titleMap = ImmutableMap.of("Key1", "Value1", "Key2", "Value2", "Key3", "Value3");
        System.out.println(titleMap.get("Key3"));
//        titleMap.put("Key4", "Value4"); // this will throw error as this map is immutable- we cant add new k,v
    }
}

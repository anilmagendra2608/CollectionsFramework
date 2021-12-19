package ArrayListConcepts;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String args[]){
        ArrayList<String> arrStr = new ArrayList<String>();
        arrStr.add("TestString0"); // 0th index
        arrStr.add("TestString1"); // 1th index
        arrStr.add("TestString2"); // 2nd index
        arrStr.add("TestString3"); // 3rd index
        arrStr.add("TestString4"); // 4th index
        arrStr.add("TestString5"); // 5th index
        arrStr.add("TestString6"); // 6th index

        // Iterating ArrayList using typical method
        for(int i = 0; i< arrStr.size(); i++) {
            System.out.println("Value at " + i +" index = " +arrStr.get(i));
        }

        // using foreach
        for (String s : arrStr) {
            System.out.println("Value Print using foreach= " + s);
        }

        // using lambda : After JDK8 -> Streams with lambda
        arrStr.stream().forEach(ele -> System.out.println("Value Print Using Lambda Expression : " + ele));

        // using Iterator Concept
        Iterator<String> itr = arrStr.iterator();
        while(itr.hasNext()) {
            System.out.println("Value Print Using Iterator : " + itr.next());
        }

        // Creating ArrayList with another ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(11,22,33,44,55));
        System.out.println("Numbers stored = " +numbers);

        ArrayList<String> str = new ArrayList<String>(Arrays.asList("Test1", "Test2", "Test3", "Test4", "Test5"));
        System.out.println("Strings stored = " +str);
    }

}

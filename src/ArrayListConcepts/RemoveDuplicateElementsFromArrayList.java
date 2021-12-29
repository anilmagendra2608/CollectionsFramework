package ArrayListConcepts;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArrayList {

    public static void main(String args[]) {

        // 1. Using LinkedHashSet
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,2,3,1,4,4,4,5,6,7,8,9,9));
        System.out.println("Before using LinkedHashSet - ArrayList with duplicate Values");
        for(int i = 0 ; i < arr.size() ; i++) {
            System.out.println(arr.get(i));
        }

        LinkedHashSet<Integer> testLHS = new LinkedHashSet<Integer>(arr);
        ArrayList<Integer> arrWithoutDuplicateEle = new ArrayList<Integer>(testLHS);
        System.out.println("After using LinkedHashSet - ArrayList without duplicate Values");
        Iterator<Integer> it = arrWithoutDuplicateEle.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 2. Using JDK 1.8 Stream concept
        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(11,22,22,33,11,44,44,44,55,66,77,88,99,99));
        List<Integer> listWithUniqueValues = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println("After Using Stream() - Unique values in list = " +listWithUniqueValues);

    }
}

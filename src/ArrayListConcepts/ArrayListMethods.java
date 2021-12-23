package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String args[]){
        testMethods();
    }
    public static void testMethods(){
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("Test1");
        arr1.add("Test2");
        arr1.add("Test3");
        arr1.add("Test4");
        arr1.add("Test5");
        arr1.add("Test6");

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Test7");
        arr2.add("Test8");
        arr2.add("Test9");

        // addAll()
        arr1.addAll(arr2);
        System.out.println("After Adding Arr2 to Arr1=" +arr1);

        // addAll(index, ArrayList)
        arr1.addAll(2, arr2);
        System.out.println("After Adding Arr2 to Arr1 From Index 2 =" +arr1);

        //clear()
        arr1.clear();
        System.out.println("After clearing Arr1=" +arr1);

        //clone()
        ArrayList<String> clonedList = (ArrayList<String>)arr2.clone();
        System.out.println("After Cloning Arr2 to ClonedList=" + clonedList);

        //contains()
        System.out.println(arr2.contains("Test9")); // will return true
        System.out.println(arr2.contains("Anil")); // will return false as this element is not in the list

        //indexOf()
        System.out.println(arr2.indexOf("Test9")); // will return 2

        ArrayList<String> List1 = new ArrayList<String>(Arrays.asList("Anil", "Rahul", "Naveen", "Lisa", "Naveen", "Karthik", "Naveen"));
        System.out.println(List1); // will print all ele
        //lastIndexOf(element)
        System.out.println(List1.lastIndexOf("Naveen")); // This will print 6
        System.out.println(List1.lastIndexOf("Test")); // This will print -1 as element not exist..No Error

        List1.remove(0); // both index and value can be used to remove from list
        List1.remove("Anil");

        //removeIf()
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        num.removeIf(n -> n%2 == 0); // remove the no from list if no is divisible by 2 = remove even no
        System.out.println(num);

        ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        num1.removeIf(e -> e%2 != 0 ); // remove the no from list if no is divisible by 2 = remove even no
        System.out.println(num1);

        //retainAll()
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Test1", "Test2", "Test3", "Test4", "Test1"));
        nameList.retainAll(Collections.singleton("Test1"));
        System.out.println("After retainAll() method use = " + nameList);
    }
}

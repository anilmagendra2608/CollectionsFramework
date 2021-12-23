package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String args[]){

        // 1. Using Collections.SynchronizedList()
        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());

        nameList.add("Test1");
        nameList.add("Test2");
        nameList.add("Test3");

        // For Add or Remove operation on ArrayList we dont need Explicit Synchronization

        // To fetch/Traverse the Value from ArrayList We Need Synchronization

        synchronized (nameList) {
            Iterator<String> it = nameList.iterator();
            while(it.hasNext()) {
                System.out.println("Synchronized ArrayList= " + it.next());
            }
        }

        // 2. CopyOnWriteArrayList Class
        // add, set, fetch values = all will be synchronized
        // Below we dont need any Synchronized keyword as its synchronized by default = Its ThreadSafe
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Bill");
        empList.add("John");
        empList.add("Tom");
        empList.add("Emma");

        Iterator<String> it = empList.iterator();
        while(it.hasNext()) {
            System.out.println("Synchronized ArrayList= " + it.next());
        }


    }
}

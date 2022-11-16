package ArrayListConcepts;

import java.util.ArrayList;

public class ArrayListDemo {
        public static void main(String[] args) {
            arrayListExample();
            virtualCapacityInArrayList();
        }

        public static void arrayListExample() {
            ArrayList<Object> ar = new ArrayList();
            ar.add(10000);
            ar.add(200);
            ar.add("Testing");
            ar.add("a");
            ar.add(15.3456D);
            System.out.println(ar);
            System.out.println("Physical Size of Array=" + ar.size());
            System.out.println("Element at index 4 = " + ar.get(4));
        }

        public static void virtualCapacityInArrayList() {
            ArrayList<Object> ar = new ArrayList(20);
            ar.add(300);
            System.out.println(ar.size());
        }

}

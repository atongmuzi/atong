package test;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 5);
        Collection<Integer> collection1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(collection);
        System.out.println(collection1);
        List list = new LinkedList();
        list.addAll(collection);
        LinkedList<Integer> list1 = new LinkedList<>(list);
        list1.iterator();
        System.out.println("list1.getFirst();"+list1.getFirst());
        System.out.println("list1.element();"+list1.element());
        System.out.println("list1.peek():"+list1.peek());
        list1.remove();
        System.out.println(list1.getFirst());
        HashSet hashSet = new HashSet();
        hashSet.iterator();
        HashMap hashMap = new HashMap();
        hashMap.keySet().iterator();



//        System.out.println(Arrays.asList(1,2,2));
//        System.out.println(new ArrayList<>());
//        //  collection.add(6);
////        Object
//        Integer[] integers = {6, 7, 8, 9, 10};
//        collection1.addAll(Arrays.asList(integers));
//        Collections.addAll(collection1,11,12,13,14,15);
//        Collections.addAll(collection1,integers);
//        System.out.println(collection1);

}
}

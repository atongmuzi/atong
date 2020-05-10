package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Closure8 {
    List<Integer> list  = new ArrayList<>();
    Supplier<List<Integer>> makefun(){
        list.add(5);
        return () -> list;
    }

    public static void main(String[] args) {
        Closure8 c8 = new Closure8();
        List<Integer> list1= c8.makefun().get();
        List<Integer> list2 = c8.makefun().get();
        System.out.println(list1);
        System.out.println(list2);
    }
}

package test;

import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImperativeRandoms {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> sortedSet = new TreeSet<>();
        while (sortedSet.size()<7){
            int num = random.nextInt(20);
            System.out.println("haha"+num);
            if (num<5) continue;;
            sortedSet.add(num);
        }
        System.out.println(sortedSet);
    }
}

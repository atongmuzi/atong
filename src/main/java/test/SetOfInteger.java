package test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> integerSet = new HashSet<>();
        for (int i=0;i<1000;i++){
            integerSet.add(random.nextInt(38));
        }
        System.out.println(integerSet);
        System.out.println(integerSet.size());

    }
}

package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PrintingCollections {
    static Collection fill(Collection<String> collection){
        String[] strings = {"a","b","c"};
        Collections.addAll(collection,strings);
        return collection;
    }

    public static void main(String[] args) {
        System.out.println(PrintingCollections.fill(new ArrayList<>(Arrays.asList("a","b"))));
    }
}

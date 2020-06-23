package test.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionToStream {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(1),new Bubble(2),new Bubble(3));
        System.out.println(bubbles.stream().mapToInt(x->x.i).sum());
        Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        w.stream().map(x->x+" ").forEach(System.out::print);
    }
}

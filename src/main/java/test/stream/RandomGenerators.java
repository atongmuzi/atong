package test.stream;

import java.util.Random;
import java.util.stream.Stream;

public class RandomGenerators {
    public static <T> void show(Stream<T> stream){
        stream.limit(4).forEach(System.out::println);
        System.out.println("++++++++++");
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        show(random.ints().boxed());
        show(random.longs().boxed());
        show(random.doubles().boxed());

    }
}

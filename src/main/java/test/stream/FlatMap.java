package test.stream;

import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1,2,3).flatMap(i->Stream.of("haha","hehe","heihei")).forEach(System.out::println);
    }
}

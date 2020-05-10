package test;

import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        Stream.of("I","Love","You").forEach(System.out::print);
        Stream.of(1,2,3.14).forEach(System.out::println);
    }
}

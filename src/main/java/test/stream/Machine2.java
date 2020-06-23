package test.stream;

import java.util.Arrays;
import java.util.stream.Stream;

import test.onjava.Operations;

public class Machine2 {
    public static void main(String[] args) {
        Arrays.stream(new Bubble[]{Bubble.bubbler(),Bubble.bubbler(),Bubble.bubbler()}).forEach(System.out::println);
        Arrays.stream(new Operations[]{Operations.show("Bing"),Operations.show("ahua"),Operations.show("alin")} ).forEach(System.out::println);
        Stream<Double> doubleStream =  Arrays.stream(new Double[]{1.21,1.31,1.32});
        doubleStream.forEach(System.out::print);

    }
}

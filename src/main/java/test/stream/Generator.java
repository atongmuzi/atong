package test.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator implements Supplier<String> {
    static int i=0;
    Random rand = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        System.out.println(rand.nextInt(letters.length));
        i++;
        return "" + letters[rand.nextInt(letters.length)];

    }

    public static void main(String[] args) {
        System.out.println(Stream.generate(new Generator()).limit(30).collect(Collectors.joining(" ")));
       // System.out.println(word);
        Stream.generate(() -> "haha").limit(3).forEach(System.out::println);

    }
}

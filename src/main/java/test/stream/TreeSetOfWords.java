package test.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;

public class TreeSetOfWords {
    public static void main(String[] args) throws Exception {
                Files.lines(Paths.get("TreeSetOfWords.java")).peek(System.out::println).flatMap(s -> Arrays.stream(s.split("\\W+"))).forEach(System.out::println);
    }
}

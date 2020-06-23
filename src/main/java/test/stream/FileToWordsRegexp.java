package test.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileToWordsRegexp {
    private String all;
    public FileToWordsRegexp(String filepath) throws IOException {
        all = Files.lines(Paths.get(filepath)).skip(1).collect(Collectors.joining(" "));
        System.out.println(all);

    }

    public Stream<String> stream(){
        return Pattern.compile("[ .,?]+").splitAsStream(all);
    }

    public static void main(String[] args) throws IOException {
       FileToWordsRegexp file= new FileToWordsRegexp("Cheese.dat");
        file.stream().limit(7).forEach(System.out::print);
        System.out.println();
        file.stream().limit(7).map(x->x+" ").forEach(System.out::print);
        String mmm = new String("123445555566222222");
    }
}

package test.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String path) throws IOException {
        Files.lines(Paths.get(path)).skip(1).forEach(line ->{for (String word:line.split("[ .?,]+")) builder.add(word);});
    }
    Stream<String> stream(){
        return builder.build();
    }

    public static void main(String[] args) throws IOException {


        new FileToWordsBuilder("Cheese.dat").stream().limit(7).forEach(System.out::print);

        System.out.println();


        new FileToWordsBuilder("Cheese.dat").stream().limit(7).map((w) -> w+" ").forEach(System.out::print);
    }

}

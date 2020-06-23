package test.stream;

public class Peeking {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("Cheese.dat")
                .limit(4).map(x->x+" ")
                .peek(System.out::print)
                .forEach(System.out::print);
    }
}

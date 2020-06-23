package test.stream;


import java.util.stream.Stream;

class Numberd{

    final int n ;
    Numberd(int n){
        this.n = n;
    }
    @Override
    public String toString(){
        return "Numbered(" + n + ")";
    }

}

public class FunctionMap2 {
    public static void main(String[] args) {
        Stream.of(1, 5, 7, 9, 11, 13).map(Numberd::new).forEach(System.out::println);
    }
}

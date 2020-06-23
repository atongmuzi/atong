package test.stream;

import java.util.stream.Stream;

public class Fibonacci {

    static  int x =1;

    public static int iterateTwoParam(int i){
            int result = i+x;
            x=i;
            return result;
    }

    Stream<Integer> numbers(){
        return Stream.iterate(2,Fibonacci::iterateTwoParam);
    }

//    Stream<Integer> numbers1(){
//        return Stream.iterate(0, i -> {
//            int result = x + i;
//            x = i;
//            return result;
//        });
//    }

    public static void main(String[] args) {
        new Fibonacci().numbers().skip(20).limit(10).forEach(System.out::println);
       // new Fibonacci().numbers1().skip(20).limit(10).forEach(System.out::println);
    }
}

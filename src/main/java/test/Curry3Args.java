package test;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Curry3Args {

    public static void main(String[] args) {
        Function<String,Function<String,Function<String,String>>> function = a->b->c->a+b+c;
        Function<String,Function<String,String>> f1 = function.apply("hi ");
        Function<String,String> f2 = f1.apply("a");
        String f3 = f2.apply("tong");
        System.out.println(f3);

        IntFunction<IntUnaryOperator> in = a->b->5;

        IntFunction<String> ins = a -> "a";
    }
}

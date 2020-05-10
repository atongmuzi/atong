package test;

import java.util.function.Function;

public class FunctionComposition {
    static Function<String,String>
    f1= s -> {
        System.out.println("f1");
        return s.replace('I', '_');
    },
    f2 = s -> s.substring(3),
    f3 = s -> s.toLowerCase(),
    f4 = f1.compose(f2).andThen(f3),
    fx = f1.compose(f2);


    public static void main(String[] args) {
        System.out.println(f1.apply("I love you"));
        System.out.println(fx.apply("I love you"));

      //  f4.apply("I love you");
    }
}

package test;

import java.util.function.Function;

interface FuncSS extends Function<String,String>{};

public class ProduceFunction {
    static FuncSS funcSS = x -> "100";
    static FuncSS produce(){
        return s -> "100";
    }

    public static void main(String[] args) {
        funcSS.getClass().getName();
        System.out.println(funcSS.apply("100"));
        FuncSS p1= produce();
        System.out.println(p1.apply("haha"));
    }
}

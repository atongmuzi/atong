package test;

import java.util.function.IntSupplier;

public class Closure1 {
    int i;
    IntSupplier makeFun(int x){
        System.out.println(i);
        return ()-> x+i++;
        }
}

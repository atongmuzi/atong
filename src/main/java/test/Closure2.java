package test;

import java.util.function.IntSupplier;

public class Closure2 {

    IntSupplier makeFun(int x){
        int i=0;
        x++;
        i++;
        int xfinal = x;
        int ifinal = i;
        return ()-> xfinal+ifinal;
    }
}

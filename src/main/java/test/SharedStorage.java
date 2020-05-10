package test;

import java.util.function.IntSupplier;

public class SharedStorage {
    public static void main(String[] args) {
        Closure1 closure1 = new Closure1();
        IntSupplier c1= closure1.makeFun(0);
        System.out.println(c1.getAsInt());
        IntSupplier c2=closure1.makeFun(0);
        System.out.println(c2.getAsInt());

    }


}

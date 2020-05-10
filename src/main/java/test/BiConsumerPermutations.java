package test;

import java.util.function.BiConsumer;

public class BiConsumerPermutations {

    static void bicidf (Integer i,Double d){
            if (i+d>0){
                System.out.println("hehe");
            }else {
                System.out.println("lala");
            }
    }

    static BiConsumer<Integer,Double> bicid = (u,v) -> System.out.println("hahaah");

    public static void main(String[] args) {
        BiConsumer<Integer,Double> f = BiConsumerPermutations::bicidf;
        System.out.println(f.getClass().getName());
        f.accept(1,2.0);
        bicidf(1,-2.0);
    }

}

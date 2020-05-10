package test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

@FunctionalInterface
interface Functional {
    String goodbye(String arg);

}

interface FunctionalNoAnn {
    String goodbye(String arg);
}

public class FunctionalAnnotation {
    public static String goodbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
            Functional f1 = FunctionalAnnotation::goodbye;
            FunctionalNoAnn fann = FunctionalAnnotation::goodbye;
            System.out.println(f1.goodbye("f1"));
            System.out.println(fann.goodbye("fann"));
    }
}

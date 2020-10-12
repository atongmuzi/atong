package test.generics.coffee;

import java.util.Random;
import java.util.function.Supplier;
//
//public class CoffeeSupplier implements Supplier<Coffee>, Iterable<Coffee> {
//    private Class<?>[] types =  {Latte.class,Americano.class,Breve.class,Cappuccino.class,Mocha.class};
//    private static Random rand = new Random(47);
//    public CoffeeSupplier() {}
//    private int size = 0;
//    public CoffeeSupplier(int sz) { size = sz; }
//    @Override
//    public Coffee get() {
//        try {
//            return (Coffee) types[rand.nextInt(types.length)].newInstance();
//        } catch (InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//}

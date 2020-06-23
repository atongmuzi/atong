package rtti;

import java.util.function.Supplier;
import java.util.stream.Stream;

class CountedInteger {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() { return Long.toString(id); }
}

public class DynamicSupplier<T> implements Supplier<T> {
    private Class<T> type;
    public DynamicSupplier(Class<T> type){
        this.type = type;
    }
    public T get(){
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public static void main(String[] args) {
        Stream.generate( new DynamicSupplier<>(CountedInteger.class)).limit(5).forEach(System.out::println);
    }


}

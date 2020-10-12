package test.generics.coffee;

public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+" "+id;
    }
}

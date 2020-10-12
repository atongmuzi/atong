package test.generics;

public class Tuple2<A,B> {
    public final A a;
    public final B b;
    public Tuple2(A a,B b){
        this.a = a;
        this.b = b;
    }
    public String rep() { return a + ", " + b; }

    @Override
    public String toString() {
        return "(" + rep() + ")";
    }

    public static void main(String[] args) {
        Tuple2<String,Integer> tuple2 = new Tuple2<>("hahah",10);
        System.out.println(tuple2);
    }
}

package test.generics;

public class GenericHolder<T> {
    private T a;
    public GenericHolder() {};
    public void setA(T a){
        this.a = a;
    }
    public T getA(){
        return a;
    }

    public static void main(String[] args) {
        GenericHolder<Automobile> automobileGenericHolder = new GenericHolder<>();
        automobileGenericHolder.setA(new Automobile());
        Automobile automobile = automobileGenericHolder.getA();
    }
}

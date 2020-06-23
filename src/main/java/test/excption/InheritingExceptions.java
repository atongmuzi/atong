package test.excption;

class SimpleException extends Exception{}
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println( "Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions exceptions = new InheritingExceptions();
        try {
            exceptions.f();
        }catch (SimpleException s){
            System.out.println("caught it");
        }
    }
}

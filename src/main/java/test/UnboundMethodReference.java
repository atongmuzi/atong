package test;

class X {
     String f() {return "X::x";}
}
interface MakeingString{
    String make();
}
interface TransformX{
    String transform(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        X x = new X();
       // MakeingString m = x::f;
        TransformX x1 = X::f;
        System.out.println(x1.transform(x));
      //  x.getClass().getName();
    }
}

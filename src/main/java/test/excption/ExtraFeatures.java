package test.excption;

class MyException2 extends Exception{
    private int x;
    MyException2(){};
    MyException2(String msg){super(msg);}
    MyException2(String msg,int x){
        super(msg);
        this.x = x;
    }
    public int val(){
        return x;
    }
    @Override
    public String getMessage(){
        return "Detail Message: "+ x
                + " "+ super.getMessage();
    }
}
public class ExtraFeatures {
    public static  void f() throws MyException {
        System.out.println(
                "Throwing MyException2 from f()");
        throw  new MyException();
    }
    public static void g() throws MyException2 {
        System.out.println(
                "Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }
    public static void h() throws MyException2 {
        System.out.println(
                "Throwing MyException2 from h()");
        throw new MyException2("Originated in h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }

        try {
            g();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }
}

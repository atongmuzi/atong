package test;

public class b implements a {
    @Override
    public void f1(){
        System.out.println("f1()");
    }

    @Override
    public void f2(){
        System.out.println("f2()");

    }
    public void f3(){
        System.out.println("f3()");

    }

    public static void main(String[] args) {
            a bb = new b();
            bb.f1();
            bb.f2();

    }
}

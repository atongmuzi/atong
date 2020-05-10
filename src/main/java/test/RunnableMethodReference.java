package test;

import java.util.List;

class Go{
   static public void go(){
       System.out.println("hello");
    }
    static public void run(){
        System.out.println("run");
    }
}
public class RunnableMethodReference {
    public static void main(String[] args) {
        new Thread(Go::go).start();
        new Thread(Go::run).start();
        new Thread(() -> System.out.println("hah"));
    }
}

package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestBed {

    public void f(){
        System.out.println("hello TestBed");
    }
    public static class Tester{
        public static void main(String[] args) {
//            Tester tester = new Tester();
            TestBed testBed = new TestBed();
            testBed.f();
            Map map = new HashMap<String,String>();
            ArrayList arrayList = new ArrayList();
        }
    }

}

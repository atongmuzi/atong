package test.onjava;

import static test.onjava.Repeat.repeat;

public class Looping {
    static void  hi(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        repeat(2,Looping::hi);
    }

}

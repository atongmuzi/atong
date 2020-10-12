package test.generics;

class Automobile {}

public class Holder1 {

    private Automobile a;

    private Holder1(Automobile a){
        this.a = a;
    }
    public Automobile getA(){
        return  a;
    }

}

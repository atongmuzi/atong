package test.enums;

import static  test.enums.SpicinessEnum.*;

public class Burrito2 {
    SpicinessEnum degree;
    public Burrito2(SpicinessEnum degree){
        this.degree = degree;
    }
    @Override
    public String toString(){
        return "Burrito is "+ degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito2(NOT));
    }
}

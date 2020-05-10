package test;

import java.util.function.BiConsumer;

public class TriFunctionTest {

//     static Long  func(Long l,Long x,Long d){
//        return l+x+d;
//    }
    static TriFunction<Integer,Integer,Integer,Integer> triFunction = (i,l,d) -> i+l+d;
//    public static void main(String[] args) {
////           int x= triFunction.apply(1,2,3);
//        TriFunction<Long,Long,Long,Long> triFunction = TriFunctionTest::func;
//        long result = triFunction.apply(1l,2l,3l);
//        System.out.println(result);
//
//
//    }
}

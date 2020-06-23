package test.stream;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionMap {
    static String[] elments = new String[]{ "12", "", "23", "45" };
    static Stream<String> testStream(){
        return Arrays.stream(elments);
    }
    static void test(String descr, Function<String,String> func){
        System.out.println(" ---( " + descr + " )---");
        testStream().map(func).forEach(System.out::println);
    }

    public static void main(String[] args) {
        test("add brackets",s -> "[" + s + "]");
        test("Increment",s -> { try {
            return Integer.parseInt(s) + 1 + "";
        }
        catch(NumberFormatException e) {
            return s;
        }});
        test("Replace",s -> s.replace("2","9"));
    }
}

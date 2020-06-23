package test.stream;

import java.util.Optional;

public class CreatingOptionals {
    static void test(String testName, Optional<String> optional){
        System.out.println(" === " + testName + " === ");
        System.out.println(optional.orElse("This Optional is null !"));
    }

    public static void main(String[] args) {
        test("empty",Optional.empty());
        test("NotNUllOptional",Optional.of("I am Optional!"));
        try {
            test("null",Optional.of(null));
        }catch (Exception e){
            System.out.println(e);
        }
        test("ofNullable",Optional.ofNullable("hi"));
        test("ofNullable",Optional.ofNullable(null));


    }

}

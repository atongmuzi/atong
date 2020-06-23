package test.stream;

import java.util.Optional;

public class Optionals {
    static void basics(Optional<String> optional){
        if (optional.isPresent()){
            System.out.println(optional.get());
        }else {
            System.out.println("Nothing inside!");
        }

    }
    static void ifPresent(Optional<String> optional){
        optional.ifPresent(System.out::println);
    }
    static void orElse(Optional<String> optional){
        System.out.println(optional.orElse("test"));
    }
    static void orElseGet(Optional<String> optional){

        optional.orElseGet(()->"Generated");
    }
    static void orElseThrow(Optional<String> optional){
        try {
            optional.orElseThrow(()->new Exception("hha"));
        } catch (Exception e) {
            System.out.println("Caught " + e);
        }
    }
}

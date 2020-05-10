package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.*;

public class Randoms {

   public List<String> stringList(){
       return  new ArrayList<>();
   }

    public static void main(String[] args) {
        System.out.println(Random.class);
        new Random(47).ints(5,20).distinct().limit(7).sorted().forEach(System.out::println);


        System.out.println();
    }
}

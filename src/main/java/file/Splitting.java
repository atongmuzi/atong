package file;

import java.util.Arrays;

public class Splitting {
    public static String knights =  "Then, when you have found the shrubbery, "
            +  "you must cut down the mightiest tree in the "
            +  "forest...with... a herring!";
    public static void split(String regex){
      String[] strings =  knights.split(regex);
      for (String s:strings){
          System.out.println(s);
      }
        System.out.println();
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
          //  split(" ");
         //   split("\\W+");
            split("n\\W+");
    }

}

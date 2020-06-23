package file;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");

        while (m.find()) {
            System.out.println(m.group());}
//            System.out.println(m.group(1));
//            System.out.println("hahaha");
//            System.out.println("0 Start:"+m.start(0)+"0 End:"+m.end(0));
//            System.out.println("1 Start:"+m.start(1)+"1 End:"+m.end(1));
            //    System.out.println(m.group(0));

//            System.out.print(m.group() + " ");
//            System.out.println();
            int i = 0;
            while (m.find(i)) {
                System.out.print(m.group() + " ");
                i++;
        }
    }
}

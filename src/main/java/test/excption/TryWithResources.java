package test.excption;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream(new File("Cheese.dat")))
        {
            int contents = in.read();
            System.out.println(contents);
        } catch(IOException e) {
            System.out.println("ahahh");
            // Handle the error
        }
    }
}

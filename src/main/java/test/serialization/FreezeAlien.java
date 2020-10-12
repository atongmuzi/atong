package test.serialization;

import com.alibaba.fastjson.JSON;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("alien.txt"));
        Alien alien = new Alien();
        objectOutputStream.writeObject(alien);

        System.out.println("hahah");

    }
}

package test.serialization;


import java.io.*;
import java.util.Random;

class Data implements Serializable{
    private int n;
    Data(int n) {this.n = n;}
    @Override
    public String toString(){
        return Integer.toString(n);
    }
}

public class Worm implements Serializable {
    private static Random rand = new Random(47);
    private Data[] d = {new Data(rand.nextInt(10)), new Data(rand.nextInt(10)), new Data(rand.nextInt(10))};
    private Worm next;
    private char c;

    public Worm(int i, char x) {
        System.out.println("Worm constructor: " + i);
        c = x;
        if (--i > 0)
            next = new Worm(i, (char) (x + 1));
    }

    public Worm() {
        System.out.println("No-arg constructor");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        for (Data dat : d)
            result.append(dat);
        result.append(")");
        if (next != null)
            result.append(next);
        return result.toString();
    }

    public static void main(String[] args) throws ClassNotFoundException,
            IOException {
        Worm worm = new Worm(6,'a');
        System.out.println("w =  " + worm);
        try(
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("worm1.txt"));
                ){
                 out.writeObject("Worm storage\n");
                 out.writeObject(worm);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out,"utf-8");

        }
        try(
                ObjectInputStream in = new ObjectInputStream(
                        new FileInputStream("worm1.txt"))
        ) {
            String s = (String)in.readObject();
            Worm w2 = (Worm)in.readObject();
            System.out.println(s + "w2 = " + w2);
        }

    }
}
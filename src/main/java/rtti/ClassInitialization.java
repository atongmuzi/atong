package rtti;


import java.util.Random;

class Initable {
    static final int STATIC_FINAL = 47;
    static final int STATIC_FINAL2 =
            ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);
    public static void main(String[] args) {
        Class initable = rtti.Initable.class;
//        try {
//            Class.forName("rtti.Initable");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        System.out.println("After creating Initable ref");
        System.out.println(Initable.STATIC_FINAL);
        System.out.println(Initable.STATIC_FINAL2);
        System.out.println(Initable2.staticNonFinal);
    }



}

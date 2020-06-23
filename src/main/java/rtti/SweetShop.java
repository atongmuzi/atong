package rtti;

class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}
class Gum{
    static {
        System.out.println("Loading Gum");
    }
    void test(){
        System.out.println("haha");
    }
}
class Candy{
    static {
        System.out.println("Loading Candy");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class z = Class.forName("Gum");
            try {
                Gum gum = (Gum) (z.newInstance());
                gum.test();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }

}

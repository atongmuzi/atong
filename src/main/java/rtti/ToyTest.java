package rtti;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
class Toy {
    // 注释下面的无参数构造器会引起 NoSuchMethodError 错误
    Toy() {}
    Toy(int i) {}
}
class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
      FancyToy() { super(1); }
}

public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName()+ " is interface? [" +cc.isInterface()+"]");
        System.out.println( "Simple name: "+cc.getSimpleName());
        System.out.println("Canonical name : " +cc.getCanonicalName());
    }
    public static void main(String[] args) {
            Class c = null;
            Class cc = null;
        try {
            c = Class.forName("rtti.FancyToy");
            cc = FancyToy.class;
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face:c.getInterfaces()){
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object object = null;

        try {
            object = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        }
        printInfo(up);
        printInfo(object.getClass());
//        boolean.class;
//        Boolean.TYPE;
//        Boolean.class;
    }

}

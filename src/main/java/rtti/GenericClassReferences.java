package rtti;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class c = int.class;
        Class<Integer> integerClass = int.class;
        integerClass = Integer.class;
        c = double.class;


    }
}

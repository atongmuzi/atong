package rtti;

public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends  Number> clazz = int.class;
        clazz = Integer.class;
        clazz = Number.class;
        clazz = double.class;
    }
}

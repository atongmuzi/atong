package rtti;

public class GenericToyTest {
    public static void main(String[] args) {
        Class<FancyToy> fancyToyClass = FancyToy.class;
        try {
            FancyToy fancyToy = fancyToyClass.newInstance();
            Class<? super FancyToy> up =fancyToyClass.getSuperclass();
            Object object = up.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

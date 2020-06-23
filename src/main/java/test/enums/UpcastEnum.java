package test.enums;

enum Search { HITHER, YON }
public class UpcastEnum {
    public static void main(String[] args) {
        Search[] searches = Search.values();
        System.out.println( Search.class.getSuperclass());
        Enum e = Search.HITHER;

        for(Enum en : e.getClass().getEnumConstants())
            System.out.println(en);
    }
    }



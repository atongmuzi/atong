package test;

public class Lambda {
    public static void main(String[] args) {
        System.out.println("hi!"+3.1415);
         new Thread(() -> System.out.println("hello lambda")).start();
    }
}

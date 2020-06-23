package test.excption;

public class ExceptionSilencer {
    public static void main(String[] args) {
        try {

            throw  new RuntimeException();

        }finally {

           // return;
            System.out.println("haha");
        }
    }
}

package test.excption;

class FundException extends Exception{}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try{
                throw new FundException();
            }finally {
                System.out.println("finally in 2nd try block");
            }
        }catch (FundException f){
            System.out.println(
                    "Caught FourException in 1st try block");
        }finally {
            System.out.println("finally in 1st try block");
        }
    }
}

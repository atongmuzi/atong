package test.excption;

public class WhoCalled {
    static void f(){
        try {
            throw new Exception();
        }catch (Exception e){
            for ( StackTraceElement element :e.getStackTrace()){
                System.out.println(element.getMethodName());
                System.out.println(element.getClassName());
            }
        }
    }
   static void g(){
        f();
   }

    public static void main(String[] args) {
        f();
        System.out.println("**********");
        g();
        System.out.println("**********");
    }
}

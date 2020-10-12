package test.excption;

import net.bytebuddy.implementation.bytecode.Throw;

public class testException extends Exception {
    testException(String msg) {
        super(msg);
    }

}
class testtest{

    static void test() throws testException {
        System.out.println("haha");
        throw new testException("hehehehahah");
    }

    public static void main(String[] args) throws testException {
        test();

    }
}

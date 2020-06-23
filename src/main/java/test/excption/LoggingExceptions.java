package test.excption;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception{
    private static Logger logger =
            Logger.getLogger("LoggingException");
    LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        String traceString = trace.toString();
        logger.severe(traceString);
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw  new LoggingException();

        }catch (LoggingException e){
            e.printStackTrace();
            System.err.println("Caught err1 " + e);
        }
    }
}

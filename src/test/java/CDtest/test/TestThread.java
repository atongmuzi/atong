package CDtest.test;

import CDtest.base.AbstractThread;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import thread.AsyncThead;

public class TestThread extends AbstractThread {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-thread.xml");
        AsyncThead asyncThead = context.getBean(AsyncThead.class);
        System.out.println("say hello 1");
        asyncThead.sayHello();
        System.out.println("say hello 2");
    }
}
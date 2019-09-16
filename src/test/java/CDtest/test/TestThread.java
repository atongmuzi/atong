package CDtest.test;

import CDtest.base.AbstractThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.testng.annotations.Test;
import thread.AsyncThead;

public class TestThread extends AbstractThread {
//    @Autowired
//    ThreadPoolTaskExecutor taskExecutor;
//    @Autowired
//    AsyncThead asyncThead;
//
//    @Test
//    public  void testThread(){
////        taskExecutor.execute(new Runnable() {
////            @Override
////            public void run() {
////                System.out.println(Thread.currentThread());
////                asyncThead.sayHello();
////            }
////        });
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-thread.xml");
//        AsyncThead asyncThead = context.getBean(AsyncThead.class);
//        System.out.println("say hello 1");
//        asyncThead.sayHello();
//        System.out.println("say hello 2");
//    }
public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-thread.xml");
        AsyncThead asyncThead = context.getBean(AsyncThead.class);
        System.out.println("say hello 1");
        asyncThead.sayHello();
        System.out.println("say hello 2");
}
}

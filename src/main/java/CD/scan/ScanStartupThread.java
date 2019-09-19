package CD.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

//@ComponentScan(value = "CD")
@Configuration
//@ComponentScan(value = "MyBatis")
@ComponentScan(basePackages = {"thread"})
//@ImportResource("classpath:spring-thread.xml")
@PropertySource("classpath:dubbo.properties")
public class ScanStartupThread {

}

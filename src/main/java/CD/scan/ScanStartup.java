package CD.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@ComponentScan(value = "CD")
@Configuration
@ComponentScan(value = "MyBatis")
//@ComponentScan(basePackages = {"CD","MyBatis"})
@ImportResource("classpath:spring-mybatis.xml")
public class ScanStartup {

}

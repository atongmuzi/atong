package CD.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@ComponentScan(value = "CD")
@Configuration
//@ComponentScan(value = "MyBatis")
@ComponentScan(basePackages = {"jdbc","MyBatis","aop"})
//@ImportResource("classpath:spring-mybatis.xml") --引入单个xml文件
//同时引入多个xml文件
@ImportResource(locations = {"classpath:spring-mybatis.xml","classpath:mybatis-config.xml"})
public class ScanStartup {
}

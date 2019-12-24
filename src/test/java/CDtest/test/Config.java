package CDtest.test;

import CD.scan.ScanStartup;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"jdbc","MyBatis","aop","CDtest"})
public class Config {
}

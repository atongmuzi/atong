package CD.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(value ="jdbc")
@ImportResource("classpath:jdbc/spring-db.xml")
public class ScanStartupJdbc {
}

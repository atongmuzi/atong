package CDtest.base;

import CD.scan.ScanStartupJdbc;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes= ScanStartupJdbc.class)
public class AbstractJdbc extends AbstractTestNGSpringContextTests {
}

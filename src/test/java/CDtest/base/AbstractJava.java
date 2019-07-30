package CDtest.base;


import CD.scan.ScanStartup;
import CD.scan.ScanStartupJava;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes = ScanStartupJava.class)
public class AbstractJava extends AbstractTestNGSpringContextTests {
}

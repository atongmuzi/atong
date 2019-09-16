package CDtest.base;


import CD.scan.ScanStartup;
import CD.scan.ScanStartupThread;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes = ScanStartupThread.class)
public class AbstractThread extends AbstractTestNGSpringContextTests {
}

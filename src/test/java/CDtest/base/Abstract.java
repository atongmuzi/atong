package CDtest.base;


import CD.scan.ScanStartup;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes = ScanStartup.class)
public class Abstract  extends AbstractTestNGSpringContextTests  {

}

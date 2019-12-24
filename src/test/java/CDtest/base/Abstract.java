package CDtest.base;


import CD.scan.ScanStartup;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes = ScanStartup.class)
@ActiveProfiles("test")
public class Abstract  extends AbstractTestNGSpringContextTests  {

}

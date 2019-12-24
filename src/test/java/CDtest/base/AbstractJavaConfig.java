package CDtest.base;


import CD.CompactDisc;
import CD.scan.ScanStartup;
import CD.scan.ScanStartupJavaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = ScanStartupJavaConfig.class)
public class AbstractJavaConfig extends AbstractTestNGSpringContextTests  {


}

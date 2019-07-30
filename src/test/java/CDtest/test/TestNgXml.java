package CDtest.test;

import CD.CdDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestNgXml {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("springscan.xml");
        CdDTO cdDTO = (CdDTO) context.getBean(CdDTO.class);
        System.out.println(cdDTO.getTitle());
        cdDTO.getSongDTO().setSongName("test");
        System.out.println(cdDTO.getSongDTO().getSongName());
    }
}

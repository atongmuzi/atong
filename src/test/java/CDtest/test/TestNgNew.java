package CDtest.test;

import CD.CdDTO;
import CDtest.base.Abstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class TestNgNew extends Abstract {

    @Autowired
    CdDTO cdDTO;
    @Test
    public void test(){

        System.out.println(cdDTO.getTitle());
        cdDTO.getSongDTO().setSongName("alin");
        System.out.println(cdDTO.getSongDTO().getSongName());
    }
}

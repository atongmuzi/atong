package CDtest.test;

import CD.CdDTO;
import CD.CompactDisc;
import CDtest.base.Abstract;
import CDtest.data.testDTOData;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;



public class TestNg extends Abstract {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdPlay(){
        String string= testDTOData.cdDTO.getValue();
        CdDTO cdDTO = JSON.parseObject(string,CdDTO.class);
        cd.play(cdDTO);
        System.out.println("ahua");
    }

}

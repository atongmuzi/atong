package CDtest.test;

import CD.CdDTO;
import CD.CompactDisc;
import CDtest.base.AbstractJava;
import CDtest.base.listener.AllureReporterListener;
import CDtest.data.testDTOData;
import com.alibaba.fastjson.JSON;
import io.qameta.allure.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import CDtest.data.staticDTOData;
import ru.yandex.qatools.allure.annotations.Title;

import static io.qameta.allure.Allure.step;


//@Listeners({AllureReporterListener.class})
public class TestNg extends AbstractJava {

    @Autowired
    private CompactDisc cd;
    @Autowired
    CdDTO cdDTO;
    public static final Logger LOGGER = LogManager.getLogger(TestNg.class);

    @Test
    @Feature("atong test")
    @Story("story1")
    @Description("该案例是为了测试通过枚举类型引入数据")
    public void cdPlay(){
        String string= testDTOData.cdDTO.getValue();
         cdDTO = JSON.parseObject(string,CdDTO.class);
        cd.play(cdDTO);
        LOGGER.info("测试通过枚举类型引入数据成功");
    }
    @Test
    @Feature("atong test")
    @Story("story2")
    @Title("test title")
    @Description("该案例是为了测试通过静态变量引入数据")
    @Link("https://example.org")
    public void cdPlayStaticData(){
        step("打印默认title"+cdDTO.title);
        LOGGER.info("默认title is "+cdDTO.title);
        Allure.addAttachment("默认title",cdDTO.toString());
        String string=staticDTOData.cdDTO;
         cdDTO = JSON.parseObject(string,CdDTO.class);
        cd.play(cdDTO);
        step("打印引入变量后的title"+cdDTO.title);
        LOGGER.info("测试通过静态变量引入数据成功");
        LOGGER.info("引入变量后title is "+ cdDTO.title);
        Allure.addAttachment("出参",cdDTO.toString());
       // Assert.assertEquals(cdDTO.title,"adbc");

    }
}

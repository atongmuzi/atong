package httpInterface.complaint;

import httpInterface.BaseCase;
import httpInterface.dto.ResultAllDTO;
import io.cex.test.framework.httputil.OkHttpClientManager;
import io.cex.test.framework.jsonutil.JsonFileUtil;
import okhttp3.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static data.baseUrlData.complaintIssureUrl;

/**
 * @author tongcy
 * @date 2020-03-09 16:02
 * @desc 投诉正常和异常案例
 **/

public class complaintIssueCase extends BaseCase {
    String postUrl;
    HashMap header;
    String token;

    @BeforeClass
    public void InvitationPre(){
        postUrl = url+complaintIssureUrl;
        token = getToken();
        header = headInit(token);
    }

    /**
     * @desc 正常用例的数据驱动
     * @param
     **/
    @DataProvider(parallel=true)
    public Object[][] InvitationTestRightData(Method method){
        String path = "./src/main/resources/complaint/right";
        HashMap<String, String>[][] arrymap = (HashMap<String, String>[][]) JsonFileUtil.jsonFileToArry(path);
        return arrymap;
    }
    /**
     * @desc 正常投诉（包括两条案例，不带图片投诉和带图片投诉）
     **/
    @Test(dataProvider = "InvitationTestRightData", description = "正常测试案例")
    public void complaintIssue(Map<?,?> param) throws IOException {
        String jsonbody = jsonToString(param);
        Response response = OkHttpClientManager.post(postUrl, jsonbody, "application/json", header);
        ResultAllDTO resultAllDTO = getResult(response, ResultAllDTO.class);
      //  AssertTool.isContainsExpect("成功",resultAllDTO.getMsg());
    }
}

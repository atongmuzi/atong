package httpInterface.forum;

import com.alibaba.fastjson.JSONArray;
import httpInterface.BaseCase;
import io.cex.test.framework.assertutil.AssertTool;
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

import  static  data.baseUrlData.forumInvitationUrl;

/**
 * @author tongcy
 * @date 2020-03-02 14:11
 * @desc 帖子测试案例
 **/
public class Invitation extends BaseCase {
    String postUrl;
    HashMap header;
    String token;

    @BeforeClass
    public void InvitationPre(){
        postUrl = url+forumInvitationUrl;
        token = getToken();
        header = headInit(token);
    }


    /**
     * @desc 正常用例的数据驱动
     * @param
     **/
    @DataProvider(parallel=true)
    public Object[][] InvitationTestRightData(Method method){
        String path = "./src/main/resources/forum/right";
        HashMap<String, String>[][] arrymap = (HashMap<String, String>[][]) JsonFileUtil.jsonFileToArry(path);
        return arrymap;
    }
    /**
     * @desc 正常发帖
     **/
    @Test(dataProvider = "InvitationTestRightData", description = "正常测试案例")
    public void invitationInsert(Map<?,?> param) throws IOException {
        String jsonbody = jsonToString(param);
        Response response = OkHttpClientManager.post(postUrl, jsonbody, "application/json", header);
        System.out.println(response);
       // AssertTool.isContainsExpect("200",response.);
    }
}

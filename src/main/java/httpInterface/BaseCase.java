package httpInterface;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.cex.test.framework.dbutil.DataBaseManager;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tongcy
 * @date 2020-02-27 16:35
 * @desc 创建http请求的基类
 **/



public class BaseCase {
    public static String url = "http://jinchacha-dev.lifengkong.cn";
    String  sql = "select * from user_token where id = '1649355467141421983' ";
    DataBaseManager dataBaseManager = new DataBaseManager();

    public HashMap<String,String> headInit(String token){
            HashMap<String,String> map = new HashMap<>();
            map.put("token",token);
            map.put("accept","application/json;responseformat=3");
            return map ;
        }

    public String jsonToString(Map<?,?> param){
        JSONObject jsonbody = JSON.parseObject(param.get("body").toString());
        String body = jsonbody.toJSONString();
        return body;
    }
    public String getToken(){
        Connection connection = dataBaseManager.getMysqlConnection("jdbc:mysql://rm-bp1710pt8uc479581go.mysql.rds.aliyuncs.com:3306/jinchacha?user=jinchacha&password=@tianli123456TL&characterEncoding=UTF-8");
        JSONArray sqlResult = dataBaseManager.executeQuery(sql,connection);
        String token = sqlResult.getJSONObject(0).getString("token");
        return token;
    }
}

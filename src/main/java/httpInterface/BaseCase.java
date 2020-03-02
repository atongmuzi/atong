package httpInterface;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tongcy
 * @date 2020-02-27 16:35
 * @desc 创建http请求的基类
 **/



public class BaseCase {
    public static String url = "http://jinchacha-dev.lifengkong.cn";

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
}

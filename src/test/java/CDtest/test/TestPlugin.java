package CDtest.test;

import org.apache.ibatis.plugin.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TestPlugin {
    @Test
    public  void  PluginInterceptGet(){
        Map map = new HashMap();
        map = (Map) new AlwaysMapPlugin().plugin(map);
        Assert.assertEquals("Always",map.get("Anything"));
    }
    @Test
    public void shouldNotInterceptToString() {
        Map map = new HashMap();
        map = (Map) new AlwaysMapPlugin().plugin(map);
        Assert.assertFalse("Always".equals(map.toString()));
    }

    @Intercepts({@Signature(type = Map.class,method = "get",args = {Object.class})})
    public static class  AlwaysMapPlugin implements Interceptor{

        @Override
        public Object intercept(Invocation invocation) throws Throwable {
            return "Always";
        }

        @Override
        public Object plugin(Object target) {
            return Plugin.wrap(target,this);
        }

        @Override
        public void setProperties(Properties properties) {

        }
    }
}

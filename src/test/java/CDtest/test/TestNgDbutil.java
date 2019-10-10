package CDtest.test;

import CDtest.base.AbstractJdbc;
import MyBatis.dto.Tadmin;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import jdbc.DBUtilsTemplate;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class TestNgDbutil extends AbstractJdbc {
    @Autowired
    DBUtilsTemplate dbUtilsTemplate;
    private static final Logger LOGGER = LogManager.getLogger(TestNgDbutil.class);

    @Test
    @Feature("atong test")
    @Story("story3")
    public void testUpdate(){
        String sql = "update user_credit set used_credit = ? where id = ? ";
        int rows = dbUtilsTemplate.update(sql,36,3);
        System.out.println("efect rows : "+rows);
        LOGGER.info("This is log test");
    }
    @Test
    public  void  findOneObject(){
        String sql = "select * from admin where id = ? ";
        Tadmin tadmin = dbUtilsTemplate.findFirst(Tadmin.class,sql,1);
        System.out.println(tadmin.getUsername());
    }
    @Test
    public void findOneMap(){
        String sql = "select * from admin where id = ? ";
        Map result = dbUtilsTemplate.findFirst(sql,1);
        System.out.println(result.get("username"));
    }
    @Test
    public void findListObject(){
        String sql = "select * from admin  ";
        List<Tadmin> list =dbUtilsTemplate.find(Tadmin.class,sql);
        System.out.println(list);
    }
}

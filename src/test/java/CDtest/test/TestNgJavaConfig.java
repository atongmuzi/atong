package CDtest.test;



import CDtest.base.AbstractJavaConfig;
import jdbc.DBUtilsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class TestNgJavaConfig extends AbstractJavaConfig {

    @Autowired
    DBUtilsTemplate dbUtilsTemplate;
    @Test
    public void testdb(){
        String sql = "update user_credit set used_credit = ? where id = ? ";
       int rows= dbUtilsTemplate.update(sql,300,3);
        System.out.println("rows:"+rows);
    }
}

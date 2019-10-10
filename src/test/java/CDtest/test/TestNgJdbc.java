package CDtest.test;

import CDtest.base.AbstractJdbc;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testng.annotations.Test;
import org.apache.log4j.*;

public class TestNgJdbc extends AbstractJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static final Logger LOGGER = LogManager.getLogger(TestNgJdbc.class);

    @Test
    @Feature("atong test")
    @Story("story3")
    public void testUpdate(){
        String sql = "update user_credit set used_credit = ? where id = ? ";
        int rows = jdbcTemplate.update(sql,36,3);
        System.out.println(Thread.currentThread().getName()+"do sometings ----"+System.currentTimeMillis());
        System.out.println("efect rows : "+rows);
        LOGGER.info("This is log test");
    }
}

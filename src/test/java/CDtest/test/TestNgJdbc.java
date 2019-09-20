package CDtest.test;

import CDtest.base.AbstractJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testng.annotations.Test;
import org.apache.log4j.*;

public class TestNgJdbc extends AbstractJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static final Logger LOGGER = LogManager.getLogger(TestNgJdbc.class);

    @Test
    public void testUpdate(){
        String sql = "update user_credit set used_credit = ? where id = ? ";
        jdbcTemplate.update(sql,36,13);
        System.out.println(Thread.currentThread().getName()+"do sometings ----"+System.currentTimeMillis());
        LOGGER.info("This is log test");
    }
}

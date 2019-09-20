package CDtest.test;

import CDtest.base.AbstractJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testng.annotations.Test;

public class TestNgJdbc extends AbstractJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    public void testUpdate(){
        String sql = "update user_credit set used_credit = ? where id = ? ";
        jdbcTemplate.update(sql,36,13);
        System.out.println(Thread.currentThread().getName()+"do sometings ----"+System.currentTimeMillis());
    }
}

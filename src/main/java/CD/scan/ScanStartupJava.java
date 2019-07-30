package CD.scan;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
@ComponentScan(value = "MyBatis")
@MapperScan(value = "MyBatis")
public class ScanStartupJava {
    @Bean
    public DataSource dataSource() {
        return new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://rm-bp1735ib5kt16n0mzpo.mysql.rds.aliyuncs.com:3306/koala?characterEncoding=utf8&useSSL=true&nullCatalogMeansCurrent=true", "koala", "@tianli123456TL");
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
}

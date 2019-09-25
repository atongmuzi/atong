package CD.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(value = "CD")
@PropertySource("classpath:dubbo.properties")
//@MapperScan(value = "MyBatis")

public class ScanStartupJava {
//    @Bean
//    public DataSource dataSource() {
//        return new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://rm-bp1735ib5kt16n0mzpo.mysql.rds.aliyuncs.com:3306/koala?characterEncoding=utf8&useSSL=true&nullCatalogMeansCurrent=true", "koala", "@tianli123456TL");
//    }
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        return sessionFactory.getObject();
//    }
}

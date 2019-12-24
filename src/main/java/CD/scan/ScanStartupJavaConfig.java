package CD.scan;

import CD.CDPlayer;
import CD.CompactDisc;
import CD.SgtPeppers;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
@ComponentScan(basePackages = {"jdbc"})
public class ScanStartupJavaConfig{
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
//    @Bean
//    public CDPlayer cdPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }
//    @Bean
//    public CDPlayer anotherCdPlayer(){
//        return  new CDPlayer(sgtPeppers());
//    }
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return  new CDPlayer(compactDisc);
    }
    @Bean
    public DataSource dataSource1(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://rm-bp1710pt8uc479581go.mysql.rds.aliyuncs.com:3306/koala?characterEncoding=utf8&useSSL=true&nullCatalogMeansCurrent=true");
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUsername("koala");
        basicDataSource.setPassword("@tianli123456TL");
        basicDataSource.setInitialSize(20);
        basicDataSource.setMaxActive(30);
        return basicDataSource;
    }
}

package CDtest.test;

import CDtest.base.Abstract;
import MyBatis.dto.Tadmin;
import MyBatis.SelectAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class TestNgMapper extends Abstract {
    @Autowired
    SelectAdminService selectAdminService;
    @Test
    public void test(){
        Tadmin tadmin=selectAdminService.select(1L);
        System.out.println(tadmin);
        System.out.println(selectAdminService.selectByPhone("13656640242"));
        System.out.println("test");
        System.out.println("atong");
        System.out.println("alin");
        System.out.println("ahua");
    }
}

package aop;

import org.springframework.stereotype.Controller;
import org.testng.annotations.Test;

@Controller
public class controller {



    @Test
    @RoleTest(role = "test")
    public void  test(){

    }


}

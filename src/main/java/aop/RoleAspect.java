package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RoleAspect {
    @Before("@annotation(roleTest)")
    public void roleJudge(RoleTest roleTest){
        if (roleTest.equals("test")) System.out.println("yes");
    }
}

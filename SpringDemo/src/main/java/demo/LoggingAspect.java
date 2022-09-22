package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* *.*.*(..))")
    public void beforeLogger(){
        System.out.println("Before logger");
    }

    @After("execution(* *.*.*(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }
}

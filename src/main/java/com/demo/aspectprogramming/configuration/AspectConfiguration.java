package com.demo.aspectprogramming.configuration;

import com.demo.aspectprogramming.annotations.EnableReadOnlyTransaction;
import com.demo.aspectprogramming.exception.ReadOnlyException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class AspectConfiguration {

    @Before("execution( * com.demo.aspectprogramming.repository.*.*(..))")
    public void before(JoinPoint joinPoint) {
        //Advice
        log.info("Before entering {}", joinPoint);
        log.info("Do something before");
    }

    @After("execution( * com.demo.aspectprogramming.repository.*.*(..))")
    public void after(JoinPoint joinPoint) {
        //Advice
        log.info("After entering {}", joinPoint);
        log.info("Do something after");
    }

    @Around("com.demo.aspectprogramming.configuration.PointcutConfiguration.readOnlyTransaction() && @annotation(enableReadOnlyTransaction)")
    public void validateAroundReadOnlyTransaction(ProceedingJoinPoint joinPoint, EnableReadOnlyTransaction enableReadOnlyTransaction) throws Throwable {
        //Advice
        log.info("Around entering {}", joinPoint);
        if (enableReadOnlyTransaction.readOnly()) {
            throw new ReadOnlyException("Code works correctly!");
        } else {
            log.info("Not read only transaction");
        }
        joinPoint.proceed(); //continue on the intercepted method
    }
}

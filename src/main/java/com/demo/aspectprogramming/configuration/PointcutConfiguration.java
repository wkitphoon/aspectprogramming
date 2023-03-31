package com.demo.aspectprogramming.configuration;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutConfiguration {
    @Pointcut("@annotation(com.demo.aspectprogramming.annotations.EnableReadOnlyTransaction)")
    public void readOnlyTransaction() {
    }
}

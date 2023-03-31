package com.demo.aspectprogramming;

import com.demo.aspectprogramming.service.ServiceA;
import com.demo.aspectprogramming.service.ServiceB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AOPTest {
    @Autowired
    private ServiceA serviceA;
    @Autowired
    private ServiceB serviceB;

    @Test
    void invokeService() {
        serviceA.doSomethingA();
        serviceB.doSomethingB();
    }

    @Test
    void invokeAspect() {
        serviceA.testAroundAspect();
    }
}

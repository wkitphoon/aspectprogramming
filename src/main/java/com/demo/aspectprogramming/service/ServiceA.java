package com.demo.aspectprogramming.service;

import com.demo.aspectprogramming.aspectrepository.AspectRepositoryA;
import com.demo.aspectprogramming.repository.RepositoryA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceA {
    @Autowired
    private RepositoryA repositoryA;
    @Autowired
    private AspectRepositoryA aspectRepositoryA;

    public void doSomethingA() {
        log.info("In ServiceA");
        repositoryA.readSomethingA();
    }

    public void testAroundAspect() {
        aspectRepositoryA.transactionA();
        aspectRepositoryA.transactionB();
    }
}

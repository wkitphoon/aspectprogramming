package com.demo.aspectprogramming.service;

import com.demo.aspectprogramming.repository.RepositoryB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceB {

    @Autowired
    private RepositoryB repositoryB;

    public void doSomethingB() {
        log.info("In Service B");
        repositoryB.readSomethingB();
    }
}

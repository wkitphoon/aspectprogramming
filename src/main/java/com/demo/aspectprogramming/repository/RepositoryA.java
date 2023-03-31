package com.demo.aspectprogramming.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class RepositoryA {

    public void readSomethingA() {
        log.info("Read Something A");
    }
}

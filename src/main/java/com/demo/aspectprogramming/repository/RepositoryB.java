package com.demo.aspectprogramming.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class RepositoryB {

    public void readSomethingB() {
        log.info("Read Something B");
    }
}

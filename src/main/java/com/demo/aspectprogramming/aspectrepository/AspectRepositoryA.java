package com.demo.aspectprogramming.aspectrepository;

import com.demo.aspectprogramming.annotations.EnableReadOnlyTransaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class AspectRepositoryA {

    @EnableReadOnlyTransaction(readOnly = false)
    public void transactionA() {
        log.info("Calling non read only transaction - this will persist data into database");
    }

    @EnableReadOnlyTransaction
    public void transactionB() {
        log.error("Should not call this function - this function will persist to database");
    }
}

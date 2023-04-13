package com.example.demo;

import com.example.demo.Dao.tradeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    tradeDao dao;
    @Test
    void contextLoads() {
        System.out.println("价格"+dao.getBalance(1));
    }

}

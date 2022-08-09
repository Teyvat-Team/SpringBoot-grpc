package com.localserver;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

/**
 * @author 王瑞
 * @date 2022/8/6
 */
@Slf4j

@SpringBootApplication
public class LocalServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LocalServerApplication.class, args);
    }
}

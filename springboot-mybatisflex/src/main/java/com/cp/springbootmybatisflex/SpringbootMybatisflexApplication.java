package com.cp.springbootmybatisflex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cp.springbootmybatisflex.mapper")
public class SpringbootMybatisflexApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisflexApplication.class, args);
    }

}

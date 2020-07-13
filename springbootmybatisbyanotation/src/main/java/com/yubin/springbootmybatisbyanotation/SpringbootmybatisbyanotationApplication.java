package com.yubin.springbootmybatisbyanotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.yubin.springbootmybatisbyanotation.mapper"})
public class SpringbootmybatisbyanotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisbyanotationApplication.class, args);
    }
}

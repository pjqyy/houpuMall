package com.houpu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.houpu.mapper")
public class HoupumallGoodsProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HoupumallGoodsProviderApplication.class, args);
    }

}

package com.example.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.provider.mapper")
@EnableDubbo
@SpringBootApplication
public class SpikeProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpikeProviderApplication.class, args);
    }

}

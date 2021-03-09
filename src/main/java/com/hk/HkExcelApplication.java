package com.hk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author pengzhengfa
 */
@MapperScan("com.hk.mapper")
@SpringBootApplication
public class HkExcelApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HkExcelApplication.class, args);
    }
    
}

package com.asc.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.asc.common.dao")
public class AscCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AscCommonApplication.class, args);
	}

}

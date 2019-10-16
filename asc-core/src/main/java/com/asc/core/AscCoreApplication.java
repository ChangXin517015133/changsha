package com.asc.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.asc.core.dao")
public class AscCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AscCoreApplication.class, args);
	}

}

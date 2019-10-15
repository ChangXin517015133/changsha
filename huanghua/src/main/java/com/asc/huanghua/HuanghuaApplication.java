package com.asc.huanghua;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.asc.huanghua.dao")
public class HuanghuaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuanghuaApplication.class, args);
	}

}

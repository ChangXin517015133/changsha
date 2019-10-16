package com.asc.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.asc.admin.dao")
public class AscAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AscAdminApplication.class, args);
	}

}

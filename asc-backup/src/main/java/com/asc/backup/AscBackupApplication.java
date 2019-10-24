package com.asc.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.asc.backup"})
public class AscBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(AscBackupApplication.class, args);
	}

}

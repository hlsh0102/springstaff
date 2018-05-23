package com.crazytd.springstaff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringstaffApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringstaffApplication.class, args);
	}
}

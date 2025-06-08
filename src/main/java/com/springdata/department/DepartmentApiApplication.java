package com.springdata.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.springdatarest.department.entities")
public class DepartmentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentApiApplication.class, args);
	}

}

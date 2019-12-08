package com.oa.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.project.manage.dao")
public class ProjectConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectConsumeApplication.class, args);
	}

}

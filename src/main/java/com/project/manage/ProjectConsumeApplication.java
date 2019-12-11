package com.project.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.project.manage.dao")
@ServletComponentScan
public class ProjectConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectConsumeApplication.class, args);
	}

}

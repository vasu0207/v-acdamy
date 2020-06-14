package com.student.vacadamya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.student.vacadamya.dao")
//@EntityScan("model")
public class VAcadamyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VAcadamyaApplication.class, args);
	}

}

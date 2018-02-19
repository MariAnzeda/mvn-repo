package com.univ.univ;

import org.springframework.boot.SpringApplication;
//import org.springframework.context.annotation.ImportResource;
//@ImportResource("classpath:spring-config.xml")
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class UnivApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(UnivApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(UnivApplication.class);
	}
}
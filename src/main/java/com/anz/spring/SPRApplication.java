package com.anz.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.anz.domain")
@EnableJpaRepositories("com.anz.core.repository")
public class SPRApplication{
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(SPRApplication.class);
	}
}

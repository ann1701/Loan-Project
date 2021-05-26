package com.cjc.app.fl.cibil.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableEurekaClient
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		System.out.println("this is cibil client");
		SpringApplication.run(Application.class, args);
	}

}

package com.cjc.app.fl.enquiry.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EnableEurekaClient
@EntityScan
@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
		System.out.println("This is Enquiry module");
		SpringApplication.run(Application.class, args);
	}

}

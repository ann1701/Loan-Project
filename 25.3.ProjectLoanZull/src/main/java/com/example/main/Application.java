package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		System.out.println("This is zull proxy server");
		SpringApplication.run(Application.class, args);
	}

}

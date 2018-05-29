package com.example.serverhi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServerHi2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerHi2Application.class, args);
	}

	@RequestMapping("/hi")
	public Object hi(){
		return "hellow world";
	}
}

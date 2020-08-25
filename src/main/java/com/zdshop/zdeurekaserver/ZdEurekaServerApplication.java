package com.zdshop.zdeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class ZdEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZdEurekaServerApplication.class, args);
	}

}

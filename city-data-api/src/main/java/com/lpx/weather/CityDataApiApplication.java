package com.lpx.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CityDataApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityDataApiApplication.class, args);
	}
}
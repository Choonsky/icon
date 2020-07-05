package com.choonsky.astra.basic_icon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(IconProperties.class)
public class IconClient {

	public static void main(String[] args) {
		SpringApplication.run(IconClient.class, args);
	}

}

package br.com.tech4me.tech4midia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Tech4midiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tech4midiaApplication.class, args);
	}

}

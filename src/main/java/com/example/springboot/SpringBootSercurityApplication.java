package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootSercurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSercurityApplication.class, args);
	}

}

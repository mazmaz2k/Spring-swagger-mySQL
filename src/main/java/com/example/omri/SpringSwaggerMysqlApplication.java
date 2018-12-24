package com.example.omri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class SpringSwaggerMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSwaggerMysqlApplication.class, args);
	}

}


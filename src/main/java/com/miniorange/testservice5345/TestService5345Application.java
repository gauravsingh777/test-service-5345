package com.miniorange.testservice5345;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TestService5345Application {

	public static void main(String[] args) {
		SpringApplication.run(TestService5345Application.class, args);
	}

}

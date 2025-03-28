package com.example.digital_library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.digital_library.repository")
@EntityScan(basePackages = "com.example.digital_library.model") // Ensure JPA scans the Book entity
public class DigitalLibraryApplication {
	public static void main(String[] args) {
		SpringApplication.run(DigitalLibraryApplication.class, args);
	}
}


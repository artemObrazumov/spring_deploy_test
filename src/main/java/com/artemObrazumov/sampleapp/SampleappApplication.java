package com.artemObrazumov.sampleapp;

import com.artemObrazumov.sampleapp.entity.SampleData;
import com.artemObrazumov.sampleapp.repository.SampleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleappApplication.class, args);
	}

	@Bean
	public CommandLineRunner fillDatabase(
			SampleRepository sampleRepository
	) {
		return (args) -> {
			sampleRepository.save(new SampleData(null, "something?"));
		};
	}
}

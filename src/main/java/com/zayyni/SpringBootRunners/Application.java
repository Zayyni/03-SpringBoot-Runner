package com.zayyni.SpringBootRunners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//lambda expression using java8 to build runners
	@Bean
	CommandLineRunner cmdRunner(){
		return args ->
				System.out.println("cmdRunner::run() method called");
	}
	@Bean
	ApplicationRunner appRunner(){
		return args ->
				System.out.println("appRunner::run() method called");
	}

}

package com.kairosds.cursospb2.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoApplication {

	public static void main(String[] args) {

		SpringApplication.run(HolaMundoApplication.class, args);
		System.out.println("HOLA MUNDO!");
	}

}

package com.example.Prueba_Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class PruebaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTestApplication.class, args);
	}

}

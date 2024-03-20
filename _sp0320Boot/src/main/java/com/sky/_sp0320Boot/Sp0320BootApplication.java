package com.sky._sp0320Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sp0320BootApplication {
//이것은 스프링부트 저장 할 때마다 리로드된다. 
	public static void main(String[] args) {
		SpringApplication.run(Sp0320BootApplication.class, args);
	}

}

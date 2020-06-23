package com.june23.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Example using ApplicationRunner
 * @author ashish
 */
@SpringBootApplication
@RestController
public class DemoApplication implements ApplicationRunner {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("In Application Runner");
	}
}

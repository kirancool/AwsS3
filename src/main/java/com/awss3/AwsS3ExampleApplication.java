package com.awss3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableAutoConfiguration
public class AwsS3ExampleApplication  {

	public static void main(String[] args) {
		SpringApplication.run(AwsS3ExampleApplication.class, args);
	}

}

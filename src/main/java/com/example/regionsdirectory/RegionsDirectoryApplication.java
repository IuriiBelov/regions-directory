package com.example.regionsdirectory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.regionsdirectory.mapper")
public class RegionsDirectoryApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegionsDirectoryApplication.class, args);
	}

}

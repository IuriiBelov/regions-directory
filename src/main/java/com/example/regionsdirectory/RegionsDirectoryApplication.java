package com.example.regionsdirectory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "com.example.regionsdirectory.mapper")
@EnableCaching
public class RegionsDirectoryApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegionsDirectoryApplication.class, args);
	}

}

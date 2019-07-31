package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class TyzgztApplication {

	public static void main(String[] args) {
		SpringApplication.run(TyzgztApplication.class, args);
	}

}

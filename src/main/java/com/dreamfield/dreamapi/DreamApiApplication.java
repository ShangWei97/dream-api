package com.dreamfield.dreamapi;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shangwei
 */
@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "com.dreamfield.dreamapi.mapper")
public class DreamApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(DreamApiApplication.class, args);
	}

}

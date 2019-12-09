package com.springboot.cachedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.springboot.cachedemo.mapper")
@SpringBootApplication
//@EnableCaching
public class CachedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachedemoApplication.class, args);
	}

}

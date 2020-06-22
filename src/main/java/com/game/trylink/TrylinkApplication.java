package com.game.trylink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.game.trylink.dao.mapper")
@SpringBootApplication
public class TrylinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrylinkApplication.class, args);
	}

}

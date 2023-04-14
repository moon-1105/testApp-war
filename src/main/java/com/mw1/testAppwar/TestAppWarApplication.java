package com.mw1.testAppwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class TestAppWarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAppWarApplication.class, args);
	}

}

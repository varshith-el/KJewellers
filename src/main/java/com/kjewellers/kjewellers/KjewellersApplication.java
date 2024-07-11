package com.kjewellers.kjewellers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KjewellersApplication {

	@GetMapping("/")
	public String home() {
		return "hbh" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(KjewellersApplication.class, args);
	}

}

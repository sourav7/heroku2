package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HerokuPublicApplication {

	@ResponseBody
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(HerokuPublicApplication.class, args);
	}

}

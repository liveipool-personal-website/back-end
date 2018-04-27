package org.liveipool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}

//	@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
//	String index() {
//		return "Hello Spring Boot！！";
//	}

	@GetMapping("/index")
	public String html() {
		return "/index.html";
	}
}

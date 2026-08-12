package com.work.SecureShop.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping("/hello")
	public String helloApi() {
		return "Hello this is a simple api..";
	}
}
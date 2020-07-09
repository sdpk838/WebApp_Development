package springboot.WebApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/")
	public String home() {
		return "Hello Deepak blueGreen Vacations is on QA";
	}
}

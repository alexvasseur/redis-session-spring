package com.example.redissession;

import jakarta.servlet.http.HttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class RedissessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedissessionApplication.class, args);
	}


	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public ModelAndView hello(HttpSession httpSession) {
		ModelAndView model = new ModelAndView("hello");
		model.addObject("sessionId", httpSession.getId());
		return model;
	}
}

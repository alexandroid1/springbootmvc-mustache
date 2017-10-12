package com.springbootmvcmustache.springbootmvcmustache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringbootmvcMustacheApplication {

	@RequestMapping("/")
	public String mustache(Model model){
		model.addAttribute("company", "OReily");
		return "template";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmvcMustacheApplication.class, args);
	}
}

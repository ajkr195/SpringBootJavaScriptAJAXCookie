package com.spring.boot.rocks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyController {

	@GetMapping("/")
	public static String homePage(Model model) {

		return "index";

	}
	@GetMapping("/modal")
	public static String modalPage(Model model) {

		return "modal";

	}

}
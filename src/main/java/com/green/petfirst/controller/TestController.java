package com.green.petfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestController {

		@GetMapping("/detail")
		public String getMethodName() {
			return "views/detail.html";
		}
		

}

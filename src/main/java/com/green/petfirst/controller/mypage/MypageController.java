package com.green.petfirst.controller.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {
	
	@GetMapping("/petfir/mypage")
	public String getMethodName() {
		return "views/mypage/mypage.html";
	}
	

}

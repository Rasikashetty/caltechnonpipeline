package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Democontroller {

		@ResponseBody
		@RequestMapping("/")
		public String display() {
			return "Hi CalTech Learners !!";
		}
	
}

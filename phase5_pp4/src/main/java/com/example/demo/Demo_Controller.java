package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo_Controller {
@ResponseBody
@RequestMapping("/display")
	public String display() {
		return "Hi learners welcome to AWS";
	}
	
}
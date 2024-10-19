package com.example.MedicalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/nayan")
	public String getData()
	{
		return "Nayan Bawane";
		
	}

}

package com.autobuses.flota;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexContreller {
	@RequestMapping("/")	
	public String getIndex() {
		return "index";
	}
}

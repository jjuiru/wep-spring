package com.sky._sp0320Boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
 @GetMapping("/")
 public String root() {
	 return "root";
 }
}


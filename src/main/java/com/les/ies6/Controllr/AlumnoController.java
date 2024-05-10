package com.les.ies6.Controllr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AlumnoController {
	
	@GetMapping("path")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}

}
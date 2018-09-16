package com.cli.grp.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {
	
	@RequestMapping ("/swagger")
	public String getSwagger() {
		return "I'm Swagger !!! ";
	}

}

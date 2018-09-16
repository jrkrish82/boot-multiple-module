package com.cli.grp.paperconfirm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PapperConfirmController 
{
	@RequestMapping ("/papperconfirm")
	public String getPapperConfirm() {
		return "I'm Papper Confirm !!! ";
	}
}

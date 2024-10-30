package com.ssw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssw.model.MailInfo;

import com.ssw.service.MailService;

@RestController
public class MailController {

	@Autowired
	private MailService service;

	@RequestMapping("/")
	public String check() {

		return "Check";

	}

	@RequestMapping("/sendMail")
	public String SendMail(@RequestBody MailInfo info) {

	     service.SendMail(info);
		
		return "Mail send Sucess";

	}



}

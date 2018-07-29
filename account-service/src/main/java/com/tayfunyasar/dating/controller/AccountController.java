package com.tayfunyasar.dating.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class AccountController {

	private static Logger logger = LoggerFactory.getLogger(AccountController.class);

	@HystrixCommand
	@GetMapping("/ping")
	public String ping() {
		logger.info("Ping from service");
		return "pong";
	}

}

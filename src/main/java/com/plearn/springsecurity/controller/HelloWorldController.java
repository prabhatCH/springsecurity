package com.plearn.springsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author prabhat.choudhary
 * @since 02/09/19
 */
@Controller
@RequestMapping(value = {"/", "/home"})
public class HelloWorldController {

	@GetMapping
	public ResponseEntity<String> helloWorld() {
		String greeting = "Hello there! Good day to you";
		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}
}

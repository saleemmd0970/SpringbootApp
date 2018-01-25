package com.courseapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("healthCheck")
public class HealthCheckController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<HttpStatus> checkHealth() {
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value="/sayHello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("hello Appi", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value="/sayBye")
	public ResponseEntity<String> sayBye() {
		return new ResponseEntity<String>("By Appi.. leave this folks alone please..", HttpStatus.OK);
	}

}

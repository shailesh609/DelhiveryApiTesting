package com.testingb2b.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.testingb2b.service.DelhiveryService;

@RestController
public class delhiveryRestController {

	@Autowired
	DelhiveryService delhiveryService;

	@PostMapping("/label/{order}")
	public void setDoc(@RequestHeader Map<String, String> headers, @RequestBody String payload, @PathVariable String order) {

		delhiveryService.setPayload(headers, payload, order);
	}

	@GetMapping("/home")
	public String getStatus(@RequestHeader Map<String, String> headers) {

		return "Hi Team, code is deployed successfully"+ headers.toString() ;
	}

}

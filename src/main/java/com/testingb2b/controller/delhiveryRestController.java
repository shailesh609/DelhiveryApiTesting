package com.testingb2b.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testingb2b.service.DelhiveryService;

@RestController
public class delhiveryRestController {

	@Autowired
	DelhiveryService delhiveryService;

	@PostMapping("/label/{order}")
	public void setDoc(HttpServletRequest request, @RequestBody String payload, @PathVariable String order) {

		delhiveryService.setPayload(request, payload, order);
	}

	@GetMapping("/home")
	public String getStatus() {

		return "Hi Team, code is deployed successfully";
	}

}

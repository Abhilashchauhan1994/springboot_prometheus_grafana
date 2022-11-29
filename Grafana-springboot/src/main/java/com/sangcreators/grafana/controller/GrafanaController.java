package com.sangcreators.grafana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class GrafanaController {

	@GetMapping("message")
	public String getMessage() {
		return "Welcome to Grafna world";
	}
}

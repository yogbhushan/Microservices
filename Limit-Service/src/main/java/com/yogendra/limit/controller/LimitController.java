package com.yogendra.limit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yogendra.limit.bean.Limit;
import com.yogendra.limit.configuration.Configuration;

@RestController
public class LimitController {

	@Autowired
	private Configuration configuration;

	@GetMapping(value = "/limit")
	public Limit getLimit() {
		return new Limit(configuration.getMinimum(), configuration.getMaximum());
	}

}

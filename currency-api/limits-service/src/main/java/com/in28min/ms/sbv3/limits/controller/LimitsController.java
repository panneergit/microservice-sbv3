package com.in28min.ms.sbv3.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.sbv3.limits.dto.LimitsConfiguration;

@RestController
@RequestMapping("/configs")
public class LimitsController {

	@Autowired
	private LimitsConfiguration limitsConfigProp;

	@GetMapping
	public ResponseEntity<LimitsConfiguration> getLimitsConfiguration() {
		return ResponseEntity.ok(limitsConfigProp);
	}
}

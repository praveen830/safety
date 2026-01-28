package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ourservice;
import com.example.demo.service.ourserviceservice;
@RestController
@RequestMapping("/api/v2")
public class ourservicecontroller {
	@Autowired
	ourserviceservice s2;
	@PostMapping("/our")
	public String addour(@RequestBody ourservice s) {
		return s2.addour(s);
	}
	@GetMapping("/ourget2")
	public List<ourservice> getour(){
		return s2.getour();
		
	}

}

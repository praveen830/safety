package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ourservice1;
import com.example.demo.service.ourservice1service;
@RequestMapping("/api/v2")
@RestController
public class ourservice1controller {
	@Autowired
	ourservice1service s2;
	@PostMapping("/our1")
	public String addour1(@RequestBody ourservice1 o) {
		return s2.addour1(o);
	}
	@GetMapping("/getour1")
	public List<ourservice1> getour1(){
		return s2.getour1();
	}

}

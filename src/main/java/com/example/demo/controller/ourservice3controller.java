package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ourservice3;
import com.example.demo.service.ourservice3service;
@RestController
@RequestMapping("/api/v2")
public class ourservice3controller {
	@Autowired
	ourservice3service s5;
	@PostMapping("/setour4")
	public String addour4(@RequestBody ourservice3 s4) {
		return s5.addour4(s4);
	}
	@GetMapping("/getour4")
	public List<ourservice3> getallour4(){
		return s5.getallour4();
	}


}

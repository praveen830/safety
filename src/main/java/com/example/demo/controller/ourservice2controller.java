package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ourservice2;
import com.example.demo.service.ourservice2service;
@RequestMapping("/api/v2")
@RestController
public class ourservice2controller {
	@Autowired
	ourservice2service s4;
	@PostMapping("/setour3")
	public String addour3(@RequestBody ourservice2 s3) {
		return s4.addour3(s3);
	}
	@GetMapping("/getour3")
	public List<ourservice2> getallour3(){
		return s4.getallour3();
	}

}

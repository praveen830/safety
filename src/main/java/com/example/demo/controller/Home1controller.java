package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.home1;
import com.example.demo.service.Home1service;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/api/v2")
public class Home1controller {
	@Autowired
	Home1service s;
	@PostMapping("/set1")
	public String home1add(@RequestBody home1 h1) {
		return s.home1add(h1);
	}
	
	@GetMapping("/get1")
	public List<home1> home1getall(){
		return s.home1getall();
	}

}

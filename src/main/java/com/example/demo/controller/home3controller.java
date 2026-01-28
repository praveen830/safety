package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.home3;
import com.example.demo.service.home3service;
@RequestMapping("/api/v2")
@RestController
public class home3controller {
	@Autowired
	home3service s3;
	@PostMapping("/set3")
	public String addhome3(@RequestBody home3 h3) {
		return s3.addhome3(h3);
	
	}
	@GetMapping("/get3")
	public List<home3> getallhome3(){
		return s3.getallhome3();
		
	}

}

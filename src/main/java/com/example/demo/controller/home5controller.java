package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.home5;
import com.example.demo.service.home5service;
@RequestMapping("/api/v2")
@RestController
public class home5controller {
	@Autowired
	home5service s5;
	@PostMapping("/set5")
	public String home5add(@RequestBody home5 h5) {
		return s5.home5add(h5);
		
	}
	@GetMapping("/get5")
	public List<home5> getallhome5(){
		return s5.getallhome5();
		
	}

}

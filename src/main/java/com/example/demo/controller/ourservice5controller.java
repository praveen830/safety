package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ourservice5;
import com.example.demo.service.ourservice5service;

@RestController
@RequestMapping("/api/v2")
public class ourservice5controller {
	@Autowired
	ourservice5service s10;
	@PostMapping("/setour10")
	public String addour7(@RequestBody ourservice5 s6) {
		return s10.addour7(s6);
	}
	@GetMapping("/getour10")
	public List<ourservice5> getallour7(){
		return s10.getallour7();
	}


}

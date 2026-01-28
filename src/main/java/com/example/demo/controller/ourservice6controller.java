package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ourservice6;
import com.example.demo.service.ourservice6service;

@RestController
@RequestMapping("/api/v2")
public class ourservice6controller {
	@Autowired
	ourservice6service s9;
	@PostMapping("/setour9")
	public String addour8(@RequestBody ourservice6 s12 ) {
		return s9.addour8(s12);
	}
	@GetMapping("/getour9")
	public List<ourservice6> getour8(){
		return s9.getour8();
	}


}

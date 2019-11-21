package com.csim.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csim.house.request.BuildRequest;
import com.csim.house.service.HouseService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/house-manager")
@Slf4j
public class HouseController {	
	
	@Autowired
	HouseService houseService;
	
	@PostMapping("/house-build")
	private ResponseEntity<String> build(@RequestBody BuildRequest buildRequest) {
		log.info("Adding house type {}, {}",buildRequest.getType(),buildRequest.getSubType());
		boolean result = houseService.buildHouse(buildRequest);
		
		if(result) {
		log.info("Added house type {}, {} to the database",buildRequest.getType(),buildRequest.getSubType());
		return new ResponseEntity<>("Correctly added house", 
			      HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Error adding house", 
				      HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

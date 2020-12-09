package com.app.bankapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bankapplication.entity.Country;
import com.app.bankapplication.repository.CountryRepository;


@RestController
@RequestMapping("/api/v1")
public class MasterController {
	
	@Autowired
	CountryRepository countryRepository;
    
	@PostMapping("/country")
	public ResponseEntity<Country> SaveCountry( @RequestBody Country country) {
		return new ResponseEntity( countryRepository.save(country),HttpStatus.OK);
	}
}

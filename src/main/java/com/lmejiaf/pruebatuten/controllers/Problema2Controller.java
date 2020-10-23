package com.lmejiaf.pruebatuten.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmejiaf.pruebatuten.dto.Problema2RequestDTO;
import com.lmejiaf.pruebatuten.dto.Problema2ResponseDTO;
import com.lmejiaf.pruebatuten.services.IProblema2Service;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/problema2")
public class Problema2Controller {

	@Autowired
	private IProblema2Service p2service;
	
	
	@PostMapping("/convertir")
	public ResponseEntity<Problema2ResponseDTO> convertir(@RequestBody Problema2RequestDTO data){
		
		return p2service.convertir(data);
	}
	
}

package com.lmejiaf.pruebatuten.services;


import org.springframework.http.ResponseEntity;

import com.lmejiaf.pruebatuten.dto.Problema2RequestDTO;
import com.lmejiaf.pruebatuten.dto.Problema2ResponseDTO;

public interface IProblema2Service {

	public ResponseEntity<Problema2ResponseDTO>convertir(Problema2RequestDTO data);
}

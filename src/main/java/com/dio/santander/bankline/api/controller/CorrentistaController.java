package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;

@RestController
@RequestMapping("/correntista")
public class CorrentistaController{
	
	@Autowired
	private CorrentistaRepository repository;
	
	@GetMapping	
	public List<Correntista> findAll() {
		return repository.findAll();
	}
}

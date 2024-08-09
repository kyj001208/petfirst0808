package com.green.petfirst.controller.service.login.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.green.petfirst.controller.service.login.SignupService;
import com.green.petfirst.domain.dto.login.SignSaveDTO;
import com.green.petfirst.domain.repository.SignupRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SignupServiceProcess implements SignupService {
	
	
	private final SignupRepository repository;
	private final PasswordEncoder pass;

	@Override
	public void save(SignSaveDTO dto) {
		
		repository.save(dto.toEntity(pass));
		
		
	}
	

}

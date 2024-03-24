package com.github.lawrence91chen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.lawrence91chen.entity.SysProp;
import com.github.lawrence91chen.repository.SysPropRepository;

@Service
public class SysPropService {
	@Autowired
	private SysPropRepository sysPropRepository;
	
	public SysProp findById(Integer id) {
		return sysPropRepository.findById(id).orElse(null);
	}
}

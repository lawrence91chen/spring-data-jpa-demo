package com.github.lawrence91chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.lawrence91chen.entity.SysProp;
import com.github.lawrence91chen.service.SysPropService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("sys-prop")
public class SysPropController {
	@Autowired
	private SysPropService sysPropService;

	@GetMapping("{id}")
	public SysProp getSysProp(@PathVariable("id") Integer id) {
		log.info("input: {}", id);
		SysProp result = sysPropService.findById(id);
		log.info("output: {}", result);

		return result;
	}
}

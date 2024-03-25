package com.github.lawrence91chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.lawrence91chen.entity.User;
import com.github.lawrence91chen.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("{id}")
	public User getUser(@PathVariable("id") Integer id) {
		return userService.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Integer create(@RequestBody User user) {
		return userService.insert(user).getId();
	}

	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public long update(@PathVariable("id") Integer id, @RequestBody User user) {
		user.setId(id);
		return userService.update(user);
	}

	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Integer id) {
		userService.delete(id);
	}
}

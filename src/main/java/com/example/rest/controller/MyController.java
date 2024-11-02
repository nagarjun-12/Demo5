package com.example.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.User;
import com.example.rest.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	MyService service;
	
	@GetMapping("users")
	public List<User> getUsers()
	{
		List<User> users = service.getUsers();
		return users;
	}
	
	@GetMapping("users/id")
	public User getUserById(int id)
	{
		User user = service.getUser(id);
		return user;
	}
	
	
	

}

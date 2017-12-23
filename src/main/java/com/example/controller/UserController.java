package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.domain.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/rs/user")
public class UserController implements IController<User> {

	@Autowired
	UserService userService;
	   
	@PostMapping("/create")
	@Override
	public ResponseEntity<String> add(@RequestBody User user) {
		try{
			userService.add(user);
			return ResponseEntity.status(201).build();
		}catch(Exception e){
			return ResponseEntity.status(500).body(e.getMessage());
		}
	}

	@Override
	@PutMapping("/update/{id}")
	public User update(@RequestBody User user, @PathVariable("id") Long id) {

		return userService.update(user, id);
	}

	@Override
	@DeleteMapping("/delete")
	public User delete(@RequestBody User user) {
		return userService.delete(user);
	}

	@Override
	@GetMapping("/{id}")
	public User get(@PathVariable("id") Long id) {

		return userService.get(id);
	}

	@Override
	@GetMapping("/")
	public List<User> getAll() {

		return userService.getAll();
	}

}

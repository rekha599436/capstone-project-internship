package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.entity.User;
import com.repository.UserRepo;

@RestController
@RequestMapping("/foodapp")
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserRepo urepo;

	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return urepo.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return urepo.findById(id).get();
	}
	
	@PostMapping("/users")
	public User saveUserDetails(@RequestBody User 	user) {
		return urepo.save(user);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return urepo.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUserById(@PathVariable int id) {
		urepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

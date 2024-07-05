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

import com.entity.Admin;
import com.entity.User;
import com.repository.AdminRepo;
import com.repository.UserRepo;

@RestController
@RequestMapping("/foodapp")
@CrossOrigin("*")
public class AdminController {
	@Autowired
	private AdminRepo arepo;

	
	@GetMapping("/admins")
	public List<Admin> getAlladmins() {
		return arepo.findAll();
	}
	
	@GetMapping("/admins/{id}")
	public Admin getAdminById(@PathVariable int id) {
		return arepo.findById(id).get();
	}
	
	@PostMapping("/admins")
	public Admin saveAdminDetails(@RequestBody Admin admin) {
		return arepo.save(admin);
	}
	
	@PutMapping("/admins")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return arepo.save(admin);
	}
	
	@DeleteMapping("/admins/{id}")
	public ResponseEntity<HttpStatus> deleteAdminById(@PathVariable int id) {
		arepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

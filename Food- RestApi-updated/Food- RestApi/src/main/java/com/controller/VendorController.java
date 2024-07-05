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
import com.entity.Vendor;
import com.repository.UserRepo;
import com.repository.VendorRepo;

@RestController
@RequestMapping("/foodapp")
@CrossOrigin("*")
public class VendorController {
	@Autowired
	private VendorRepo vrepo;

	
	@GetMapping("/vendors")
	public List<Vendor> getAllVendors() {
		return vrepo.findAll();
	}
	
	@GetMapping("/vendors/{id}")
	public Vendor getVendorById(@PathVariable int id) {
		return vrepo.findById(id).get();
	}
	
	@PostMapping("/vendors")
	public Vendor saveVendorDetails(@RequestBody Vendor vendor) {
		return vrepo.save(vendor);
	}
	
	@PutMapping("/vendors")
	public Vendor updateUser(@RequestBody Vendor vendor) {
		return vrepo.save(vendor);
	}
	
	@DeleteMapping("/vendors/{id}")
	public ResponseEntity<HttpStatus> deleteVendorById(@PathVariable int id) {
		vrepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

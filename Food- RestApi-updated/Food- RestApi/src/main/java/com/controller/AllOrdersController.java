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
import com.entity.AllOrders;
import com.entity.User;
import com.repository.AdminRepo;
import com.repository.AllOrdersRepo;
import com.repository.UserRepo;

@RestController
@RequestMapping("/foodapp")
@CrossOrigin("*")
public class AllOrdersController {
	@Autowired
	private AllOrdersRepo aorepo;

	
	@GetMapping("/orders")
	public List<AllOrders> getAllorders() {
		return aorepo.findAll();
	}
	
	@GetMapping("/orders/{id}")
	public AllOrders getorderById(@PathVariable int id) {
		return aorepo.findById(id).get();
	}
	
	@PostMapping("/orders")
	public AllOrders saveorderDetails(@RequestBody AllOrders order) {
		return aorepo.save(order);
	}
	
	@PutMapping("/orders")
	public AllOrders updateorder(@RequestBody AllOrders order) {
		return aorepo.save(order);
	}
	
	@DeleteMapping("/orders/{id}")
	public ResponseEntity<HttpStatus> deleteOrderById(@PathVariable int id) {
		aorepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

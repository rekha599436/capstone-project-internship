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

import com.entity.Dishes;
import com.entity.User;
import com.repository.DishesRepo;
import com.repository.UserRepo;

@RestController
@RequestMapping("/foodapp")
@CrossOrigin("*")
public class DishesController {
	@Autowired
	private DishesRepo drepo;

	
	@GetMapping("/dishes")
	public List<Dishes> getAllDishes() {
		return drepo.findAll();
	}
	
	@GetMapping("/dishes/{id}")
	public Dishes getDishById(@PathVariable int id) {
		return drepo.findById(id).get();
	}
	
	@PostMapping("/dishes")
	public Dishes saveDishDetails(@RequestBody Dishes dish) {
		return drepo.save(dish);
	}
	
	@PutMapping("/dishes")
	public Dishes updateDish(@RequestBody Dishes dish) {
		return drepo.save(dish);
	}
	
	@DeleteMapping("/dishes/{id}")
	public ResponseEntity<HttpStatus> deleteDishById(@PathVariable int id) {
		drepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

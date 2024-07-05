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

import com.entity.Cart;
import com.entity.User;
import com.repository.CartRepo;
import com.repository.UserRepo;

@RestController
@RequestMapping("/foodapp")
@CrossOrigin("*")
public class CartController {
	@Autowired
	private CartRepo crepo;

	
	@GetMapping("/cart")
	public List<Cart> getAllcarts() {
		return crepo.findAll();
	}
	
	@GetMapping("/cart/{id}")
	public Cart getCartById(@PathVariable int id) {
		return crepo.findById(id).get();
	}
	
	@PostMapping("/carts")
	public Cart saveCartDetails(@RequestBody Cart cart) {
		return crepo.save(cart);
	}
	
	@PutMapping("/carts")
	public Cart updateCart(@RequestBody Cart cart) {
		return crepo.save(cart);
	}
	
	@DeleteMapping("/carts/{id}")
	public ResponseEntity<HttpStatus> deleteCartById(@PathVariable int id) {
		crepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

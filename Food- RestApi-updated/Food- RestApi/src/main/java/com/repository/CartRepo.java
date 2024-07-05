package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Cart;


@Repository
public interface CartRepo extends JpaRepository<Cart,Integer>{

}

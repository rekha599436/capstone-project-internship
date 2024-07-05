package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Dishes;


@Repository
public interface DishesRepo extends JpaRepository<Dishes,Integer>{

}

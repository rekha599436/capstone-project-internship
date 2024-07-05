package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.entity.AllOrders;


@Repository
public interface AllOrdersRepo extends JpaRepository<AllOrders,Integer>{

}

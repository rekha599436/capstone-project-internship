package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.entity.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor,Integer>{

}

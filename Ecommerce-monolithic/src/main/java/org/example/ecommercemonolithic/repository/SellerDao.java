package org.example.ecommercemonolithic.repository;

import org.example.ecommercemonolithic.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerDao extends JpaRepository<Seller, Integer> {
	
	Optional<Seller> findByMobile(String mobile);
	
}

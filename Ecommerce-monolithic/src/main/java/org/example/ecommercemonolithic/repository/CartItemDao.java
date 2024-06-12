package org.example.ecommercemonolithic.repository;


import org.example.ecommercemonolithic.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemDao extends JpaRepository<CartItem, Integer> {

}

package org.example.ecommercemonolithic.service;


import org.example.ecommercemonolithic.models.CartDTO;
import org.example.ecommercemonolithic.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}

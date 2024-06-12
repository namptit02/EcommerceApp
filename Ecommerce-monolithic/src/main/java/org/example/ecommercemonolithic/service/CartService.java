package org.example.ecommercemonolithic.service;


import org.example.ecommercemonolithic.exception.CartItemNotFound;
import org.example.ecommercemonolithic.exception.ProductNotFoundException;
import org.example.ecommercemonolithic.models.Cart;
import org.example.ecommercemonolithic.models.CartDTO;

public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFoundException;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}

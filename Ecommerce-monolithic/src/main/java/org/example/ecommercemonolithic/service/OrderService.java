package org.example.ecommercemonolithic.service;


import org.example.ecommercemonolithic.exception.LoginException;
import org.example.ecommercemonolithic.exception.OrderException;
import org.example.ecommercemonolithic.models.Customer;
import org.example.ecommercemonolithic.models.Order;
import org.example.ecommercemonolithic.models.OrderDTO;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {
	public Order saveOrder(OrderDTO odto, String token) throws LoginException, OrderException;
	
	public Order getOrderByOrderId(Integer OrderId) throws OrderException;
	
	public List<Order> getAllOrders() throws OrderException;
	
	public Order cancelOrderByOrderId(Integer OrderId,String token) throws OrderException;
	
	public Order updateOrderByOrder(OrderDTO order,Integer OrderId,String token) throws OrderException,LoginException;
	
	public List<Order> getAllOrdersByDate(LocalDate date) throws OrderException;

	public Customer getCustomerByOrderid(Integer orderId) throws OrderException;
	
	//public Customer getCustomerIdByToken(String token) throws CustomerNotFoundException;
	

	
}

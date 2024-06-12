package org.example.ecommercemonolithic.service;


import org.example.ecommercemonolithic.models.CustomerDTO;
import org.example.ecommercemonolithic.models.SellerDTO;
import org.example.ecommercemonolithic.models.SessionDTO;
import org.example.ecommercemonolithic.models.UserSession;

public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}

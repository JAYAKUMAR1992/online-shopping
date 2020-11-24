package net.jaya.shoppingbackend.dao;

import java.util.List;

import net.jaya.shoppingbackend.dto.Address;
import net.jaya.shoppingbackend.dto.User;

public interface UserDAO {

/*	// user related operation
	User getByEmail(String email);
	User get(int id);
	
	// adding and updating a new address
	Address getAddress(int addressId);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	*/
	
	
	// add an user
	boolean addUser(User user);
	User getByEmail(String email);
	
	
	// add an address
	boolean addAddress(Address address);
	
	//alternative
	//Address getBillingAddress(int userId);
	//List<Address> listShippingAddresses(int userId);
	
	Address getBillingAddress(User user);
	List<Address> listShippingAddresses(User user);
	
	
	
}

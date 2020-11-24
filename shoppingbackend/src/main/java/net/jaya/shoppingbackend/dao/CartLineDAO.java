package net.jaya.shoppingbackend.dao;

import java.util.List;

import net.jaya.shoppingbackend.dto.Cart;
import net.jaya.shoppingbackend.dto.CartLine;

public interface CartLineDAO {


	public CartLine get(int id);	
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean delete(CartLine cartLine);
	public List<CartLine> list(int cartId);

	
	// other business method related to the cart lines
	public List<CartLine> listAvailable(int cartId);
	public CartLine getByCartAndProduct(int cartId, int productId);		
	
	
	// fetch the CartLine based on cartId and productId
	
	// updating the cart
	boolean updateCart(Cart cart);
	

	
	// adding order details
	//boolean addOrderDetail(OrderDetail orderDetail);

	
}



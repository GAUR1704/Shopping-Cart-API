package com.prowings.shopping_cart_app.service;

import com.prowings.shopping_cart_app.model.dto.BillDTO;
import com.prowings.shopping_cart_app.model.dto.Item;

public interface CartService {
	
	public boolean addItemToCart(Item item);
	
	public BillDTO calculateBill();

}

package com.prowings.shopping_cart_app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.shopping_cart_app.model.dto.BillDTO;
import com.prowings.shopping_cart_app.model.dto.CartDTO;
import com.prowings.shopping_cart_app.model.dto.Item;
import com.prowings.shopping_cart_app.model.dto.ProductDTO;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private ProductService productService;
	
	List<ProductDTO> items = new ArrayList<>();
	private CartDTO cartDTO = new CartDTO();

	@Override
	public boolean addItemToCart(Item item) {
		
		ProductDTO product = productService.getProductById(item.getProductId());
		if(product != null) {
			cartDTO.setItems(items);
			cartDTO.getItems().add(product);
			return true;
		}
		return false;
	}

	@Override
	public BillDTO calculateBill() {
		
		double totalPrice = 0;
		for(ProductDTO p : cartDTO.getItems())
		{
			totalPrice += p.getPrice();
		}
		
		double taxablePrice = calculateTax();
		double finalPrice = totalPrice + taxablePrice;
		return new BillDTO(totalPrice, taxablePrice, finalPrice);
	}

	private double calculateTax() {
		return 110;
	}

}

package com.prowings.shopping_cart_app.service;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prowings.shopping_cart_app.model.dto.Product;
import com.prowings.shopping_cart_app.model.dto.ProductDTO;

@Service
public class ProductService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	DozerBeanMapper beanMapper;
	
	
	public ProductDTO getProductById(String productId) {
		
		ResponseEntity<Product> fetchProduct = restTemplate.getForEntity("/products/"+productId, Product.class);
		
		Product product = fetchProduct.getBody();
		
		System.out.println(product);
		
		ProductDTO productDTO = beanMapper.map(product, ProductDTO.class);
		
		return productDTO;
	}

}

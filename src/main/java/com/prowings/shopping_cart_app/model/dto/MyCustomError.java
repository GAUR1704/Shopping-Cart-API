package com.prowings.shopping_cart_app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyCustomError {
	
	private String message;
	private String rootCause;
	private int statusCode;

}

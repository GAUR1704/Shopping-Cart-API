package com.prowings.shopping_cart_app.interceptors;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class HeaderModificationInterceptor implements ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		System.out.println(">>> inside Header Modifier Interceptor!!!");
		ClientHttpResponse response = execution.execute(request, body);
		
		response.getHeaders().add("aaa", "zzz");
		
		return response;
	}


}